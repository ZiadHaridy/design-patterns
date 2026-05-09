# Command Pattern

## Intent

**Encapsulate a request as an object**, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

## UML Class Diagram

```
┌───────────────┐       ┌──────────────────────┐       ┌────────────────┐
│    Invoker    │       │   <<interface>>       │       │   Receiver     │
├───────────────┤       │      Command          │       ├────────────────┤
│ - command     │──────►├──────────────────────┤  uses │ + action()     │
├───────────────┤       │ + execute(): void    │──────►└────────────────┘
│ + setCommand()│       │ + undo(): void       │
│ + invoke()    │       └──────────┬───────────┘
└───────────────┘                  │ implements
                         ┌─────────┴────────────┐
                         ▼                      ▼
               ┌──────────────────┐  ┌──────────────────┐
               │  ConcreteCommandA│  │  ConcreteCommandB│
               ├──────────────────┤  ├──────────────────┤
               │ - receiver       │  │ - receiver       │
               │ execute()        │  │ execute()        │
               │ undo()           │  │ undo()           │
               └──────────────────┘  └──────────────────┘
```

**Key elements:**

- **Command** — interface with `execute()` and optionally `undo()`
- **ConcreteCommand** — implements `execute()` by calling one or more `Receiver` methods, stores state for `undo()`
- **Receiver** — the object that actually does the work (editor, lamp, bank account…)
- **Invoker** — asks the command to execute; may maintain a history for undo
- **Client** — creates ConcreteCommands and sets them on the Invoker

## How It Works

1. Define a `Command` interface with at least `execute()`
2. Each `ConcreteCommand` wraps a `Receiver` and translates `execute()` into a specific receiver call
3. The `Invoker` stores and calls commands — it's decoupled from the receiver
4. For undo/redo, the ConcreteCommand saves enough state to reverse the action in `undo()`

## When to Use

- When you need to **parameterize objects** with operations (e.g. menu items, buttons)
- When you need to **queue or schedule** operations for later execution
- When you need **undo/redo** functionality
- When you need to **log and replay** operations (transactional systems)

## When NOT to Use

- When the operation is simple and there is no need for undo/history — the extra indirection adds complexity
- When the set of operations is fixed and won't change — direct method calls are simpler

## Command vs Strategy

| Aspect        | Strategy                                      | Command                                          |
| ------------- | --------------------------------------------- | ------------------------------------------------ |
| Intent        | Vary the algorithm used inside a method       | Encapsulate a request for parameterization, queuing, logging |
| History/Undo  | No                                            | Yes — commands can store state and be reversed   |
| Receiver      | The strategy IS the algorithm (no receiver)   | The command delegates to a receiver              |

## Use Cases in This Module

| #  | Use Case                                         | Focus                                        |
| -- | ------------------------------------------------ | -------------------------------------------- |
| 01 | [Text Editor](01-text-editor/)                   | Insert/Delete with undo/redo history         |
| 02 | [Smart Home](02-smart-home/)                     | Turn on/off multiple devices via one remote  |
| 03 | [Restaurant Order](03-restaurant-order/)         | Waiter queues order, kitchen executes        |
| 04 | [Bank Transaction](04-bank-transaction/)         | Debit command with rollback support          |
| 05 | [Task Queue](05-task-queue/)                     | Queue commands and flush/cancel them         |
