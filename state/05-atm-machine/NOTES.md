# 05 - ATM Machine

## The Problem (Bad Version)

`ATM` has 4 states and 4 actions. Every method needs to check the current state string — that's 16 conditional branches in one class. Adding a "CardBlocked" state touches every method.

## The Fix (Good Version)

`IdleState`, `CardInsertedState`, `PinVerifiedState` each implement the 4 actions for their state only. Wrong-PIN handling lives entirely inside `CardInsertedState`. Cash dispensing logic lives entirely in `PinVerifiedState`.

```java
atm.insertCard();     // IdleState → CardInsertedState
atm.enterPin(1234);   // CardInsertedState → PinVerifiedState
atm.requestCash(200); // dispense + back to IdleState
```

## Key Takeaway

ATMs, elevators, and order fulfillment pipelines are classic State pattern examples. The transition diagram maps directly to the code — one class per node, one `setState()` call per arrow.
