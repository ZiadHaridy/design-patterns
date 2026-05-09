# 04 - Database Logger

## The Problem (Bad Version)

`InfoConsoleLogger`, `WarningConsoleLogger`, `ErrorFileLogger`… each combination is a class. Three levels × three targets = nine classes.

## The Fix (Good Version)

- **Abstraction**: `Logger` → `InfoLogger`, `WarningLogger`, `ErrorLogger`  
- **Implementor**: `LogTarget` → `ConsoleTarget`, `FileTarget`, `DatabaseTarget`

```java
new ErrorLogger(new DatabaseTarget()).log("Disk full");
new InfoLogger(new ConsoleTarget()).log("App started");
```

## Key Takeaway

Logging systems almost always have two orthogonal dimensions: severity and destination. Bridge is the natural fit.
