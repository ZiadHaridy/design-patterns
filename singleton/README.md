# Singleton Pattern

## Intent

Ensure a class has **only one instance** and provide a **global point of access** to it.

## UML Class Diagram

```
┌─────────────────────────────────┐
│          Singleton              │
├─────────────────────────────────┤
│ - instance: Singleton           │
├─────────────────────────────────┤
│ - Singleton()                   │
│ + getInstance(): Singleton      │
│ + someBusinessMethod(): void    │
└─────────────────────────────────┘
```

**Key elements:**

- **Private static field** `instance` holds the single instance
- **Private constructor** prevents external instantiation
- **Public static method** `getInstance()` returns the single instance

## How It Works

1. Make the constructor `private` so no other class can instantiate it
2. Create a `private static` field to hold the single instance
3. Provide a `public static` method that returns the instance, creating it on first call

## When to Use

- When exactly **one instance** of a class is needed across the entire application
- When that single instance must be **accessible** from a well-known access point
- Common real-world examples: database connections, loggers, configuration managers, caches

## When NOT to Use

- When you need multiple instances (even if you think you only need one now)
- When the class holds no state — use a utility class with static methods instead
- When dependency injection is available — prefer DI over Singleton for testability

## Common Pitfalls

- **Thread safety** — naive implementations break in multi-threaded environments
- **Testing difficulty** — global state makes unit testing harder
- **Hidden dependencies** — classes silently depend on the Singleton

## Use Cases in This Module

| #   | Use Case                                           | Focus                                    |
| --- | -------------------------------------------------- | ---------------------------------------- |
| 01  | [Database Connection](01-database-connection/)     | Why multiple DB connections are wasteful |
| 02  | [Logger](02-logger/)                               | Centralized logging with one instance    |
| 03  | [Configuration Manager](03-configuration-manager/) | Single source of truth for app config    |
| 04  | [Cache Manager](04-cache-manager/)                 | Shared in-memory cache                   |
| 05  | [Thread Safety](05-thread-safety/)                 | Thread-safe Singleton variants           |
