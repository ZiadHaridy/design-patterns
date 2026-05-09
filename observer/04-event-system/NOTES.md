# 04 - Event System

## The Problem (Bad Version)

`Button` instantiates `FormValidator` and `ApiService` directly. The button is tightly coupled to the business logic that happens when it's clicked — it can't be reused in another screen.

## The Fix (Good Version)

An `EventListener` interface. `Button` fires `onEvent("click")` to all registered listeners. The listeners do whatever they want with the event. The button is now a pure UI component.

## Key Takeaway

Every modern UI framework (Swing, Android, React's synthetic events, DOM `addEventListener`) is this pattern. Observer separates "the thing that fires events" from "the things that react to them."
