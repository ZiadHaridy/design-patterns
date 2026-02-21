# 01 - Database Connection

## The Problem (Bad Version)

Every service creates its own `DatabaseConnection` using `new`:

```java
DatabaseConnection connA = new DatabaseConnection("jdbc:...");
DatabaseConnection connB = new DatabaseConnection("jdbc:...");
DatabaseConnection connC = new DatabaseConnection("jdbc:...");
```

This creates **3 separate connections** to the same database, which:

- Wastes memory and CPU
- Exhausts the database connection pool
- Makes it impossible to manage the connection lifecycle centrally

## The Fix (Good Version)

Apply the Singleton pattern:

1. **Private constructor** — prevents `new DatabaseConnection()` from outside
2. **Private static field** — stores the single instance
3. **Public static `getInstance()`** — returns the one shared instance

```java
DatabaseConnection conn = DatabaseConnection.getInstance();
```

Now all services share **one connection** object, regardless of how many times `getInstance()` is called.

## Key Takeaway

Use Singleton when creating multiple instances of a resource-heavy object (like a DB connection) is wasteful and unnecessary. The pattern guarantees exactly one instance exists.
