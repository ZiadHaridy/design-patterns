# 01 - Text Editor

## The Problem (Bad Version)

`TextEditor` tracks `lastOp` and `lastValue` as loose variables. `undo()` dispatches on a string tag with `if/else`. Only one level of undo is possible.

## The Fix (Good Version)

`Command` interface with `execute()` and `undo()`. Each command stores enough state to reverse itself:

- `InsertCommand` knows what it appended → `undo()` removes that exact text
- `DeleteCommand` captures the deleted text in `execute()` → `undo()` re-inserts it

`EditorHistory` is the invoker. It keeps a stack of executed commands and pops + undoes them on demand.

```java
history.execute(new InsertCommand(doc, "Hello"));
history.undo();   // reverses the insert
```

## Key Takeaway

Command is the pattern behind every Ctrl+Z in every text editor ever. The stack of executed Command objects *is* the history. New operations require no changes to the history mechanism.
