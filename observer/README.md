# Observer Pattern

## Intent

Define a **one-to-many dependency** between objects so that when one object (the **Subject**) changes state, all its **Observers** are notified and updated automatically.

## UML Class Diagram

```
┌──────────────────────────────────┐        ┌──────────────────┐
│           <<interface>>           │        │   <<interface>>  │
│             Subject               │        │    Observer      │
├──────────────────────────────────┤        ├──────────────────┤
│ + attach(Observer): void          │        │ + update(): void │
│ + detach(Observer): void          │        └────────┬─────────┘
│ + notifyObservers(): void         │                 │ implements
└──────────────┬───────────────────┘        ┌────────┴─────────┐
               │ implements                 │  ConcreteObserver │
               ▼                            ├──────────────────┤
    ┌────────────────────────┐              │ + update(): void  │
    │    ConcreteSubject      │ ──────────► └──────────────────┘
    ├────────────────────────┤  notifies
    │ - state                │
    │ - observers: List       │
    ├────────────────────────┤
    │ + setState()            │
    │ + getState()            │
    └────────────────────────┘
```

**Key elements:**

- **Subject** — maintains a list of observers, provides attach/detach/notify
- **ConcreteSubject** — holds the state that observers are interested in
- **Observer** — interface with an `update()` method
- **ConcreteObserver** — reacts to the state change when notified

## How It Works

1. The **Subject** keeps a `List<Observer>`
2. Observers call `attach()` to subscribe and `detach()` to unsubscribe
3. When the Subject's state changes, it calls `notifyObservers()` which calls `update()` on each observer
4. Each **ConcreteObserver** pulls what it needs from the subject (pull model) or receives it as a parameter (push model)

## When to Use

- When a change in one object must **automatically trigger changes** in others, and you don't know in advance how many objects need to change
- When objects should be able to **notify other objects without assumptions** about who those objects are (loose coupling)
- When you need to support **dynamic subscription** — observers can come and go at runtime

## When NOT to Use

- When observers update in a chain that causes cascade updates — can be hard to trace and debug
- When the number of observers is always fixed and small — a direct method call is simpler
- When update order matters strictly — the standard observer pattern doesn't guarantee order

## Observer vs Polling

| Aspect              | Polling                              | Observer                                 |
| ------------------- | ------------------------------------ | ---------------------------------------- |
| Coupling            | Observer depends on Subject's timing | Subject depends on the Observer interface |
| Efficiency          | Burns CPU even when nothing changes  | Event-driven — fires only on change      |
| Dynamic subscribers | Hard to add/remove                   | attach/detach at any time                |
| Debugging           | Easier to trace (pull-based)         | Harder (push-based, async possible)      |

## Use Cases in This Module

| #  | Use Case                                          | Focus                                         |
| -- | ------------------------------------------------- | --------------------------------------------- |
| 01 | [Stock Market](01-stock-market/)                  | Price changes notify multiple investor types  |
| 02 | [Weather Station](02-weather-station/)            | Sensor data pushed to multiple displays       |
| 03 | [Newsletter](03-newsletter/)                      | Subscribe/unsubscribe at runtime              |
| 04 | [Event System](04-event-system/)                  | UI button notifies multiple listeners         |
| 05 | [Auction](05-auction/)                            | New bid notifies all registered bidders       |
