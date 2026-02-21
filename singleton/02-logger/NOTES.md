# 02 - Logger

## The Problem (Bad Version)

Each module creates its own `Logger`:

```java
Logger userLogger = new Logger();
Logger orderLogger = new Logger();
```

Result: logs are **fragmented** across separate instances. There is no single view of what happened in the application.

## The Fix (Good Version)

With Singleton, all modules call `Logger.getInstance()` and share **one log list**:

```java
Logger logger = Logger.getInstance();
logger.log("Something happened");
```

All 5 log entries end up in the same Logger, giving you a **centralized, chronological** view of the entire application.

## Key Takeaway

Logging is a classic Singleton use case. You want **one** logger that aggregates messages from every part of the application, with consistent formatting and a single output stream.
