# State Pattern

## Intent

Allow an object to **alter its behavior when its internal state changes**. The object will appear to change its class.

## UML Class Diagram

```
┌──────────────────────────────┐       ┌──────────────────────┐
│           Context             │       │   <<interface>>      │
├──────────────────────────────┤       │      State           │
│ - state: State               │──────►├──────────────────────┤
├──────────────────────────────┤  uses │ + handle(Context)    │
│ + setState(State): void      │       └──────────┬───────────┘
│ + request(): void            │                  │ implements
└──────────────────────────────┘       ┌──────────┴──────────┐
                                       ▼                     ▼
                              ┌──────────────────┐  ┌──────────────────┐
                              │   ConcreteStateA │  │   ConcreteStateB │
                              ├──────────────────┤  ├──────────────────┤
                              │ handle(Context)  │  │ handle(Context)  │
                              └──────────────────┘  └──────────────────┘
```

**Key elements:**

- **Context** — the object whose behavior changes; delegates calls to the current `State`
- **State** — interface declaring the methods the Context will delegate
- **ConcreteState** — implements `State`; each state class contains the behavior for one state and decides when to transition to another state by calling `context.setState()`

## How It Works

1. Identify all possible states of an object and the transitions between them
2. Create a `State` interface with a method for each action the context supports
3. Create one class per state; each class implements the action for that state and calls `context.setState(nextState)` when a transition should happen
4. The `Context` holds a reference to the current state and delegates every action to it

## When to Use

- When an object **behaves differently depending on its current state** and must change behavior at runtime
- When you have **large conditional blocks** (if/else or switch) that select behavior based on state — each branch can become a State class
- When state transitions are **complex** and logic for "what happens in state X" is scattered across the codebase

## When NOT to Use

- When you only have **2-3 simple states** with trivial transitions — a flag or enum may be clearer
- When states don't carry their own logic — just toggling a boolean is simpler

## State vs Strategy

| Aspect               | Strategy                                    | State                                                 |
| -------------------- | ------------------------------------------- | ----------------------------------------------------- |
| Who changes the algo | The client (injects a strategy)             | The state itself (calls `context.setState()`)         |
| Knowledge of others  | Strategies don't know about each other      | States know about transitions to other states         |
| Intent               | Swap algorithms                             | Model lifecycle / workflow                            |

## Use Cases in This Module

| #  | Use Case                                           | Focus                                              |
| -- | -------------------------------------------------- | -------------------------------------------------- |
| 01 | [Vending Machine](01-vending-machine/)             | Idle → HasCoin → Dispensing transitions            |
| 02 | [Traffic Light](02-traffic-light/)                 | Red → Green → Yellow cycle                         |
| 03 | [Document Workflow](03-document-workflow/)         | Draft → Review → Published → Archived              |
| 04 | [Media Player](04-media-player/)                   | Stopped → Playing → Paused transitions             |
| 05 | [ATM Machine](05-atm-machine/)                     | Idle → Card Inserted → PIN Entered → Dispensing    |
