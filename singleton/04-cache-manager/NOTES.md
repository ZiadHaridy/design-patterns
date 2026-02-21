# 04 - Cache Manager

## The Problem (Bad Version)

Each service creates its own `CacheManager`:

```java
CacheManager userCache = new CacheManager();
CacheManager orderCache = new CacheManager();
```

Data cached by `UserService` is **invisible** to `OrderService`. This defeats the entire purpose of caching — data that should be shared ends up isolated.

## The Fix (Good Version)

With Singleton, every service shares **one** cache:

```java
CacheManager cache = CacheManager.getInstance();
cache.put("user:alice", "Alice Smith");

// Another service can immediately find it:
CacheManager.getInstance().get("user:alice"); // HIT!
```

## Key Takeaway

An in-memory cache must be **shared** to be useful. If each module has its own cache, you get cache misses for data that was already fetched, and you waste memory storing duplicates. Singleton ensures one cache is used application-wide.
