# Decorator Pattern

## Intent

Attach **additional responsibilities** to an object **dynamically**. Decorators provide a flexible alternative to subclassing for extending functionality.

## UML Class Diagram

```
          ┌──────────────────────┐
          │    <<interface>>     │
          │     Component        │
          ├──────────────────────┤
          │ + operation(): String│
          └──────────┬───────────┘
                     │
          ┌──────────┴───────────┐
          │                      │
┌─────────┴──────────┐ ┌────────┴─────────────────┐
│  ConcreteComponent  │ │      Decorator           │
├────────────────────┤ ├──────────────────────────┤
│ + operation()      │ │ - wrapped: Component      │
└────────────────────┘ │ + Decorator(Component)    │
                       │ + operation(): String     │
                       └────────────┬──────────────┘
                                    │
                       ┌────────────┴──────────────┐
                       │                           │
             ┌─────────┴─────────┐   ┌─────────────┴────────┐
             │ ConcreteDecoratorA │   │ ConcreteDecoratorB   │
             ├───────────────────┤   ├──────────────────────┤
             │ + operation()     │   │ + operation()        │
             └───────────────────┘   └──────────────────────┘
```

**Key elements:**

- **Component** — interface defining the operation
- **ConcreteComponent** — the base object being decorated
- **Decorator** — abstract class that wraps a Component and delegates to it
- **ConcreteDecorators** — add behavior before/after delegating to the wrapped component

## How It Works

1. Define a **Component interface** with the core operation
2. Create a **ConcreteComponent** that implements the base behavior
3. Create a **Decorator** class that wraps a Component and forwards calls
4. Create **ConcreteDecorators** that add behavior and delegate to the wrapped object
5. **Stack decorators** by wrapping one inside another at runtime

## When to Use

- When you need to add responsibilities to objects **at runtime**, not at compile time
- When extending behavior via subclassing would lead to a **class explosion**
- When you want to **combine** multiple behaviors flexibly (mix and match)

## When NOT to Use

- When you only need one fixed extension — simple inheritance is fine
- When the order of decoration matters and is hard to control
- When too many small decorator classes make the code harder to follow

## Decorator vs Inheritance

| Aspect          | Inheritance                    | Decorator                        |
| --------------- | ------------------------------ | -------------------------------- |
| When decided    | Compile time                   | Runtime                          |
| Flexibility     | Fixed class hierarchy          | Mix and match freely             |
| Class count     | Explodes with combinations     | One class per behavior           |
| Open/Closed     | Must modify or extend classes  | Add new decorators without change|

## Use Cases in This Module

| #  | Use Case                                      | Focus                                    |
| -- | --------------------------------------------- | ---------------------------------------- |
| 01 | [Coffee Shop](01-coffee-shop/)                | Class explosion vs composable add-ons    |
| 02 | [Notification Sender](02-notification-sender/)| Stacking multiple notification channels  |
| 03 | [Data Stream](03-data-stream/)                | Layered I/O processing (encrypt, compress)|
| 04 | [Text Formatter](04-text-formatter/)          | Combining text transformations           |
| 05 | [Pizza Order](05-pizza-order/)                | Dynamic topping combinations with cost   |
