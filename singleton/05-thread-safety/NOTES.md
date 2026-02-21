# 05 - Thread Safety

## The Problem (Bad Version)

The naive lazy Singleton is **not thread-safe**:

```java
public static Singleton getInstance() {
    if (instance == null) {          // Thread A checks: null → true
        // Thread B also checks:    null → true (A hasn't assigned yet)
        instance = new Singleton();  // Both threads create an instance!
    }
    return instance;
}
```

Two threads can pass the `null` check simultaneously, creating **two instances** and breaking the Singleton guarantee.

## The Fixes (Good Version)

Four thread-safe approaches are demonstrated, from simplest to best:

### 1. Synchronized Method

```java
public static synchronized Singleton getInstance() { ... }
```

- **Pros:** Simple, correct
- **Cons:** Lock acquired on every call, even after instance exists (performance hit)

### 2. Double-Checked Locking

```java
private static volatile Singleton instance;

public static Singleton getInstance() {
    if (instance == null) {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
    }
    return instance;
}
```

- **Pros:** Lock only acquired during first creation
- **Cons:** Slightly complex, requires `volatile`

### 3. Eager Initialization

```java
private static final Singleton INSTANCE = new Singleton();
```

- **Pros:** Simplest, JVM guarantees thread safety
- **Cons:** Instance created even if never used

### 4. Bill Pugh / Holder Pattern (Recommended)

```java
private static class Holder {
    private static final Singleton INSTANCE = new Singleton();
}

public static Singleton getInstance() {
    return Holder.INSTANCE;
}
```

- **Pros:** Lazy + thread-safe + no synchronization overhead
- **Cons:** None — this is the recommended approach in Java

## Comparison Table

| Approach            | Lazy? | Thread-Safe? | Performance | Complexity |
| ------------------- | ----- | ------------ | ----------- | ---------- |
| Naive (bad)         | Yes   | No           | Fast        | Low        |
| Synchronized        | Yes   | Yes          | Slow        | Low        |
| Double-Checked      | Yes   | Yes          | Fast        | Medium     |
| Eager               | No    | Yes          | Fast        | Low        |
| Bill Pugh (Holder)  | Yes   | Yes          | Fast        | Low        |

## Key Takeaway

In multi-threaded Java applications, always use a thread-safe Singleton. The **Bill Pugh / Holder pattern** is the recommended approach — it is lazy, thread-safe, and requires no explicit synchronization.
