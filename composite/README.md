# Composite Pattern

## Intent

Compose objects into **tree structures** to represent part-whole hierarchies. Composite lets clients **treat individual objects and compositions of objects uniformly**.

## UML Class Diagram

```
┌───────────────────────────────────┐
│          <<abstract>>             │
│           Component               │
├───────────────────────────────────┤
│ + operation(): void               │
│ + add(Component): void            │
│ + remove(Component): void         │
└──────────────┬────────────────────┘
               │
       ┌───────┴────────┐
       ▼                ▼
┌───────────┐    ┌──────────────────┐
│   Leaf    │    │    Composite     │
├───────────┤    ├──────────────────┤
│operation()│    │ - children: List │
└───────────┘    ├──────────────────┤
                 │ operation()      │
                 │ add(Component)   │
                 │ remove(Component)│
                 └──────────────────┘
                          │
                          ▼ (contains)
                      Component[]
```

**Key elements:**

- **Component** — common interface/abstract class for both leaves and composites
- **Leaf** — represents a single object (no children)
- **Composite** — holds a collection of `Component` children and delegates operations to them
- **Client** — interacts only with `Component`, unaware whether it's a leaf or composite

## How It Works

1. Define a **Component** interface with the operations clients will call
2. **Leaf** classes implement the operation directly for a single object
3. **Composite** classes hold a list of `Component` children and forward operations to each child (recursion)
4. The **client** treats a single leaf and a whole tree the same way

## When to Use

- When you need to represent **part-whole hierarchies** of objects (trees, nested groups)
- When clients should **ignore the difference** between an individual object and a group of objects
- When operations should **propagate recursively** through a structure (e.g., total size of a folder, render a UI tree)

## When NOT to Use

- When the structure is flat (no nesting) — a simple list is enough
- When leaves and composites have **wildly different interfaces** — forcing a common one creates ugly empty methods
- When you need strict type-safety distinguishing leaves from composites at compile time

## Composite vs Manual Recursion

| Aspect              | Manual recursion (instanceof / casts)        | Composite                              |
| ------------------- | -------------------------------------------- | -------------------------------------- |
| Adding a new node type | Edit every recursive method               | Add a new class, no changes elsewhere  |
| Type checks         | `if (x instanceof Folder) ...`               | Polymorphism — no checks needed        |
| Client code         | Must distinguish leaves from composites      | Treats all nodes uniformly             |
| Open/Closed         | Violates — must edit on each new type        | Respects — extend by adding subclasses |

## Use Cases in This Module

| #  | Use Case                                               | Focus                                          |
| -- | ------------------------------------------------------ | ---------------------------------------------- |
| 01 | [File System](01-file-system/)                         | Files and folders sharing a common interface   |
| 02 | [Organization Hierarchy](02-organization-hierarchy/)   | Employees and managers in a tree               |
| 03 | [Graphic Shapes](03-graphic-shapes/)                   | Shapes and shape groups rendered uniformly     |
| 04 | [Menu System](04-menu-system/)                         | Menu items and nested submenus                 |
| 05 | [UI Components](05-ui-components/)                     | Containers holding buttons, panels, and more   |
