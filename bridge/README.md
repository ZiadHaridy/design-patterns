# Bridge Pattern

## Intent

**Decouple an abstraction from its implementation** so that the two can vary independently.

## UML Class Diagram

```
┌──────────────────────────────┐        ┌─────────────────────────┐
│      Abstraction             │        │   <<interface>>          │
├──────────────────────────────┤        │    Implementor           │
│ # impl: Implementor          │───────►├─────────────────────────┤
├──────────────────────────────┤  uses  │ + operationImpl(): void  │
│ + operation(): void          │        └────────────┬────────────┘
└──────────────┬───────────────┘                     │ implements
               │ extends                   ┌──────────┴──────────┐
               ▼                           ▼                     ▼
    ┌──────────────────────┐    ┌──────────────────┐  ┌──────────────────┐
    │  RefinedAbstraction  │    │  ConcreteImplA   │  │  ConcreteImplB   │
    ├──────────────────────┤    ├──────────────────┤  ├──────────────────┤
    │ + operation(): void  │    │ operationImpl()  │  │ operationImpl()  │
    └──────────────────────┘    └──────────────────┘  └──────────────────┘
```

**Key elements:**

- **Abstraction** — the high-level control layer, holds a reference to an `Implementor`
- **RefinedAbstraction** — extends the abstraction with additional operations
- **Implementor** — declares the low-level interface for platform/device work
- **ConcreteImplementor** — does the actual low-level work for one platform

## How It Works

1. Separate two orthogonal class hierarchies into **Abstraction** (what) and **Implementor** (how)
2. The `Abstraction` holds a reference to an `Implementor` (composition, not inheritance)
3. `Abstraction.operation()` delegates the platform work to `impl.operationImpl()`
4. Both hierarchies can grow independently — adding a new abstraction or a new implementor doesn't affect the other side

## When to Use

- When you want to **avoid a permanent binding** between abstraction and implementation
- When both abstractions and implementations should be **extensible by subclassing** and you don't want a class explosion (e.g. 3 shapes × 4 renderers = 12 classes without Bridge, vs 3+4=7 with Bridge)
- When **changes to the implementation shouldn't affect the client** code
- When you need to **switch implementations at runtime**

## When NOT to Use

- When there is only one implementation — the extra layer adds complexity for no benefit
- When abstraction and implementation never vary independently — prefer simple inheritance

## Bridge vs Adapter

| Aspect           | Adapter                                         | Bridge                                          |
| ---------------- | ----------------------------------------------- | ----------------------------------------------- |
| Intent           | Make two **incompatible interfaces** cooperate  | **Separate** abstraction from implementation upfront |
| When applied     | Usually retrofitted to existing code            | Designed in from the start                      |
| Direction        | One-way: adapts an existing class to a target   | Two-way: both sides can vary independently      |

## Use Cases in This Module

| #  | Use Case                                       | Focus                                             |
| -- | ---------------------------------------------- | ------------------------------------------------- |
| 01 | [Remote & Device](01-remote-device/)           | TV/Radio as devices, Basic/Advanced remotes       |
| 02 | [Shape Renderer](02-shape-renderer/)           | Shape vs renderer — 2×2 without class explosion  |
| 03 | [Message Sender](03-message-sender/)           | Message type vs delivery channel                  |
| 04 | [Database Logger](04-database-logger/)         | Log level vs output target                        |
| 05 | [Payment Gateway](05-payment-gateway/)         | Order type vs payment processor                   |
