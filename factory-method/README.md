# Factory Method Pattern

## Intent

Define an **interface for creating an object**, but let **subclasses decide which class to instantiate**. Factory Method lets a class **defer instantiation to subclasses**.

## UML Class Diagram

```
┌─────────────────────────────┐         ┌──────────────────┐
│      <<abstract>>           │         │   <<interface>>   │
│         Creator             │         │      Product      │
├─────────────────────────────┤         ├──────────────────┤
│ + someOperation(): void     │         │ + use(): void     │
│ # createProduct(): Product  │◄────────┤                   │
└──────────────┬──────────────┘  uses   └──────────────────┘
               │                                 ▲
       ┌───────┴────────┐                ┌───────┴────────┐
       ▼                ▼                ▼                ▼
┌─────────────┐  ┌─────────────┐  ┌─────────────┐  ┌─────────────┐
│CreatorA     │  │CreatorB     │  │ProductA     │  │ProductB     │
├─────────────┤  ├─────────────┤  ├─────────────┤  ├─────────────┤
│createProduct│  │createProduct│  │use()        │  │use()        │
│→ ProductA   │  │→ ProductB   │  └─────────────┘  └─────────────┘
└─────────────┘  └─────────────┘
```

**Key elements:**

- **Product** — the interface of objects the factory method creates
- **ConcreteProduct** — a concrete implementation of `Product`
- **Creator** — declares the abstract `createProduct()` (the factory method) and uses it inside other methods
- **ConcreteCreator** — overrides `createProduct()` to return a specific `ConcreteProduct`

## How It Works

1. Define a **Product** interface with the operations clients need
2. Provide multiple **ConcreteProduct** implementations
3. Define a **Creator** with an abstract `createProduct()` method (the factory method) and ordinary methods that consume `Product`
4. Each **ConcreteCreator** overrides `createProduct()` to instantiate the right concrete product
5. Clients choose a creator subclass — the rest of the code only deals with `Product`

## When to Use

- When a class **shouldn't know in advance** which class of object it must create
- When you want subclasses to **decide what to create** while keeping the higher-level workflow shared
- When you want to **localize the `new`** so the rest of the code depends on the abstraction
- When you need to **add new product types** without rewriting client code

## When NOT to Use

- When there is only one product type — direct instantiation is simpler
- When product creation is trivial and not likely to change — a simple constructor is enough
- When you only need a single shared instance — Singleton may fit better

## Factory Method vs Direct `new`

| Aspect                  | Direct `new`                          | Factory Method                          |
| ----------------------- | ------------------------------------- | --------------------------------------- |
| Adding a product type   | Edit every place that does `new`      | Add a new Creator subclass              |
| Coupling                | Code depends on concrete classes      | Code depends on the Product abstraction |
| Open/Closed             | Violates — must edit on each new type | Respects — extend by subclassing        |
| Testability             | Hard to swap real for fake            | Inject a different Creator              |

## Factory Method vs Abstract Factory

| Aspect                  | Factory Method                            | Abstract Factory                          |
| ----------------------- | ----------------------------------------- | ----------------------------------------- |
| What it creates         | One product (per creator subclass)        | A family of related products              |
| Mechanism               | Inheritance — subclass overrides a method | Composition — uses a factory object       |
| Typical use             | "Which kind of pizza does this store make?" | "Which kind of UI toolkit am I using?"  |

## Use Cases in This Module

| #  | Use Case                                              | Focus                                      |
| -- | ----------------------------------------------------- | ------------------------------------------ |
| 01 | [Document Creator](01-document-creator/)              | App workflow shared, document type varies  |
| 02 | [Logger Factory](02-logger-factory/)                  | Choose file vs console logger by subclass  |
| 03 | [Pizza Store](03-pizza-store/)                        | Classic GoF — regional pizza store chain   |
| 04 | [Vehicle Factory](04-vehicle-factory/)                | Same dealership flow, different vehicles   |
| 05 | [Payment Processor](05-payment-processor/)            | Same checkout, different payment products  |
