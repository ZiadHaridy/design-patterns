# 02 - Smart Home

## The Problem (Bad Version)

`SmartHomeRemote.pressSlot()` has an `if/else` for every device and action. The remote is tightly coupled to every concrete device. Undo is impossible.

## The Fix (Good Version)

Each slot holds a `Command`. The remote just calls `execute()` or `undo()` — it doesn't know what the command does. Commands are wired up at startup:

```java
remote.setSlot(0, new LightOnCommand(livingRoom));
remote.setSlot(1, new LightOffCommand(livingRoom));
```

Adding a `FanCommand` for a ceiling fan = two new classes. The remote never changes.

## Key Takeaway

This is the Head First Design Patterns example. Any configurable controller (game controller, macro keyboard, toolbar) is the same shape.
