# Abstract Factory Pattern

## Intent

Provide an interface for creating **families of related or dependent objects** without specifying their concrete classes.

## UML Class Diagram

```
┌──────────────────────────────┐         ┌────────────────┐  ┌────────────────┐
│       <<interface>>           │         │ <<interface>>  │  │ <<interface>>  │
│       AbstractFactory         │         │   ProductA     │  │   ProductB     │
├──────────────────────────────┤         ├────────────────┤  ├────────────────┤
│ + createProductA(): ProductA │ ──────► │   use()        │  │   use()        │
│ + createProductB(): ProductB │ ──────► └────────────────┘  └────────────────┘
└──────────────┬───────────────┘                  ▲                  ▲
               │                                  │                  │
       ┌───────┴────────┐                ┌────────┴────────┐ ┌───────┴────────┐
       ▼                ▼                ▼                 ▼ ▼                ▼
┌─────────────┐  ┌─────────────┐   ┌──────────┐  ┌──────────┐ ┌──────────┐ ┌──────────┐
│Factory1     │  │Factory2     │   │ProductA1 │  │ProductA2 │ │ProductB1 │ │ProductB2 │
└─────────────┘  └─────────────┘   └──────────┘  └──────────┘ └──────────┘ └──────────┘
       │                │                ▲             ▲           ▲           ▲
       │ creates        │ creates        │             │           │           │
       └─► A1 + B1      └─► A2 + B2 ─────┘             │           │           │
                              └──────────────────────────┘           │           │
                                                                     └───────────┘
```

**Key elements:**

- **AbstractFactory** — declares creation methods for each kind of product in the family
- **ConcreteFactory** — implements those methods, producing a self-consistent set of products
- **AbstractProduct** — interface for one kind of product (e.g. `Button`)
- **ConcreteProduct** — a specific variant (e.g. `WindowsButton`, `MacButton`)
- **Client** — uses the factory and the abstract products only — never the concrete classes

## How It Works

1. Define interfaces for each kind of product in the family (`Button`, `Checkbox`, ...)
2. Provide concrete implementations grouped into matching variants (`Windows*`, `Mac*`)
3. Define an **AbstractFactory** with one creation method per product kind
4. Provide a **ConcreteFactory** per variant that creates only its own products
5. The **client** receives an `AbstractFactory` and never names a concrete product

## When to Use

- When the system must work with **multiple families of related products** that **must be used together** (e.g. all-Windows widgets, all-Mac widgets)
- When you want to enforce that products from different families **don't get mixed**
- When you want to **swap whole families at once** by switching the factory

## When NOT to Use

- When you only have **one kind of product** — use Factory Method
- When the families don't actually have to stay consistent — separate factories may be simpler
- When extending the family means adding **new product kinds** often — Abstract Factory makes this expensive (every factory must add the new method)

## Abstract Factory vs Factory Method

| Aspect             | Factory Method                                   | Abstract Factory                                |
| ------------------ | ------------------------------------------------ | ----------------------------------------------- |
| What it creates    | One product (per creator subclass)               | A family of related products                    |
| Mechanism          | Inheritance — subclass overrides a single method | Composition — the client holds a factory object |
| Family consistency | Not enforced                                     | Enforced — one factory makes the whole set      |
| Typical example    | Document creator, logger picker                  | Cross-platform UI, themed components, DB driver |

## Use Cases in This Module

| #  | Use Case                                                  | Focus                                          |
| -- | --------------------------------------------------------- | ---------------------------------------------- |
| 01 | [Cross-Platform UI](01-cross-platform-ui/)                | Windows vs Mac widgets, must match             |
| 02 | [Database Driver](02-database-driver/)                    | MySQL vs PostgreSQL connection + command       |
| 03 | [Game Environment](03-game-environment/)                  | Medieval vs Sci-Fi character + weapon          |
| 04 | [Furniture Factory](04-furniture-factory/)                | Modern vs Victorian chair + sofa + table       |
| 05 | [Theme Factory](05-theme-factory/)                        | Light vs Dark button + text field              |
