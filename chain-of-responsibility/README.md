# Chain of Responsibility Pattern

## Intent

Avoid coupling the sender of a request to its receiver by giving **more than one object a chance to handle the request**. Chain the receiving objects and **pass the request along the chain** until an object handles it.

## UML Class Diagram

```
┌───────────────────────────────────────┐
│           <<abstract>>                │
│             Handler                   │
├───────────────────────────────────────┤
│ - nextHandler: Handler                │
├───────────────────────────────────────┤
│ + setNext(Handler): Handler           │
│ + handle(Request): void               │
└──────────────────┬────────────────────┘
                   │
     ┌─────────────┼─────────────┐
     ▼             ▼             ▼
┌─────────┐  ┌─────────┐  ┌─────────┐
│Handler A │  │Handler B │  │Handler C │
├─────────┤  ├─────────┤  ├─────────┤
│ handle() │  │ handle() │  │ handle() │
└─────────┘  └─────────┘  └─────────┘

Request flow:  Client → A → B → C → (unhandled)
```

**Key elements:**

- **Handler** — abstract class declaring `handle()` and holding a reference to the next handler
- **ConcreteHandlers** — each decides whether to process the request or pass it to the next
- **Client** — sends the request to the first handler in the chain

## How It Works

1. Define a **Handler** base class with a `setNext()` method and abstract `handle()`
2. Each **ConcreteHandler** checks if it can handle the request
3. If **yes** → process it (optionally stop or continue the chain)
4. If **no** → pass to the next handler via `super.handle()` or `next.handle()`
5. The **client** assembles the chain and sends the request to the first handler

## When to Use

- When **more than one object** may handle a request and the handler isn't known in advance
- When you want to **decouple** the sender from the receiver
- When requests should be handled by a **pipeline** of processors (e.g., middleware, filters)
- When you want to **add/remove/reorder** handlers without touching existing code

## When NOT to Use

- When there's always exactly one handler — direct method call is simpler
- When the chain can silently drop requests (add a fallback/default handler)
- When performance is critical and the chain is very long

## Chain of Responsibility vs if/else

| Aspect           | if/else chains                    | Chain of Responsibility             |
| ---------------- | --------------------------------- | ----------------------------------- |
| Adding a handler | Modify existing method            | Add a new class and link it in      |
| Order control    | Fixed in the code                 | Configurable at runtime             |
| Single Responsibility | One method does everything   | Each handler does one thing         |
| Testability      | Must test the whole block         | Each handler tested independently   |

## Use Cases in This Module

| #  | Use Case                                                  | Focus                                      |
| -- | --------------------------------------------------------- | ------------------------------------------ |
| 01 | [Support Ticket](01-support-ticket/)                      | Escalation: L1 → L2 → L3 support          |
| 02 | [Authentication Pipeline](02-authentication-pipeline/)    | Sequential validation checks               |
| 03 | [Expense Approval](03-expense-approval/)                  | Manager → Director → VP approval levels    |
| 04 | [Logging Levels](04-logging-levels/)                      | INFO → DEBUG → ERROR level filtering       |
| 05 | [Request Middleware](05-request-middleware/)               | HTTP middleware pipeline (auth, logging, rate-limit) |
