# Strategy Pattern

## Intent

Define a **family of algorithms**, encapsulate each one, and make them **interchangeable**. Strategy lets the algorithm vary independently from the clients that use it.

## UML Class Diagram

```
┌─────────────────────────────────┐
│            Context              │
├─────────────────────────────────┤
│ - strategy: Strategy            │
├─────────────────────────────────┤
│ + setStrategy(Strategy): void   │
│ + executeStrategy(): void       │
└──────────────┬──────────────────┘
               │ uses
               ▼
     ┌─────────────────────┐
     │   <<interface>>     │
     │      Strategy       │
     ├─────────────────────┤
     │ + execute(): void   │
     └──────────┬──────────┘
                │
    ┌───────────┼───────────┐
    ▼           ▼           ▼
┌────────┐ ┌────────┐ ┌────────┐
│Concrete│ │Concrete│ │Concrete│
│Strategy│ │Strategy│ │Strategy│
│   A    │ │   B    │ │   C    │
└────────┘ └────────┘ └────────┘
```

**Key elements:**

- **Strategy** — interface declaring the algorithm method
- **ConcreteStrategy** — each class implements one specific algorithm
- **Context** — holds a reference to a Strategy and delegates the work to it

## How It Works

1. Define a **Strategy interface** with the algorithm method
2. Create **ConcreteStrategy** classes — one per algorithm variant
3. The **Context** stores a strategy and calls it, without knowing which one
4. The client **chooses** which strategy to inject at runtime

## When to Use

- When you have **multiple variants of an algorithm** and want to switch between them
- When you have a **giant if/else or switch** that selects behavior — replace it with strategies
- When you want to **isolate** the algorithm from the code that uses it
- When you want to swap behaviors **at runtime** (e.g., user chooses payment method)

## When NOT to Use

- When you only have one or two algorithms that rarely change — simple if/else is fine
- When the algorithms never need to vary — don't over-engineer

## Strategy vs if/else

| Aspect           | if/else chains                    | Strategy Pattern                    |
| ---------------- | --------------------------------- | ----------------------------------- |
| Adding a variant | Modify existing method            | Add a new class (Open/Closed)       |
| Readability      | Grows harder to read over time    | Each strategy is self-contained     |
| Testability      | Must test the whole method        | Each strategy tested independently  |
| Runtime swap     | Requires conditional re-evaluation| Just call `setStrategy()`           |

## Use Cases in This Module

| #  | Use Case                                        | Focus                                          |
| -- | ----------------------------------------------- | ---------------------------------------------- |
| 01 | [Payment Method](01-payment-method/)            | Replace if/else with pluggable payment strategies |
| 02 | [Sorting Algorithm](02-sorting-algorithm/)      | Swap sort algorithms without changing the sorter  |
| 03 | [Discount Calculator](03-discount-calculator/)  | Pricing rules as interchangeable strategies       |
| 04 | [File Compressor](04-file-compressor/)          | Different compression algorithms                  |
| 05 | [Navigation Route](05-navigation-route/)        | Choose routing mode at runtime                    |
