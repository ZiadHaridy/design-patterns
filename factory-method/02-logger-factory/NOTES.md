# 02 - Logger Factory

## The Problem (Bad Version)

`Application.run(String loggerType)` decides which logger to use AND knows how each logger writes its messages. Adding a remote/syslog/JSON logger means editing both the dispatch and the writing logic in one big method.

## The Fix (Good Version)

A `Logger` interface with concrete `FileLogger` and `ConsoleLogger`. The abstract `Application` calls a factory method `createLogger()` that subclasses override:

```java
new ConsoleLoggingApp().run();   // uses ConsoleLogger
new FileLoggingApp().run();      // uses FileLogger
```

The shared workflow code talks only to `Logger`.

## Key Takeaway

When the same workflow needs to plug in different concrete dependencies, factory method moves the choice to a subclass and keeps the workflow stable.
