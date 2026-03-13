# 04 - Logging Levels

## The Problem (Bad Version)

All log levels are handled in one `if/else`:

```java
if (level.equals("INFO")) { System.out.println(...); }
else if (level.equals("ERROR")) { System.err.println(...); }
```

- Can't route INFO to console and ERROR to a file/alert
- Adding WARNING or TRACE means editing the Logger
- Can't test each level's output independently

## The Fix (Good Version)

Each log level has its own handler:

```java
info.setNext(debug).setNext(error);
info.log(LogLevel.ERROR, "DB failed!");
// → InfoLogger: not my level, pass
// → DebugLogger: not my level, pass
// → ErrorLogger: MY level! → stderr + alert
```

**Note:** Unlike the support ticket example, here messages **always pass through the entire chain** — each handler checks if the level matches. This variant allows multiple handlers to process the same message if needed.

## Key Takeaway

Chain of Responsibility has two variants:
1. **Stop on first match** (support ticket, expense approval)
2. **Pass through all** (logging — every handler gets a chance)

Real logging frameworks (Log4j, SLF4J) use exactly this pattern to route log messages to different "appenders."
