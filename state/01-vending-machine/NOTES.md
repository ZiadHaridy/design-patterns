# 01 - Vending Machine

## The Problem (Bad Version)

`VendingMachine` stores state as a string and dispatches behavior with `if/else` in `insertCoin()`, `pressButton()`, and `dispense()`. Every method has to handle every state. Adding an `OUT_OF_STOCK` state = three methods to edit.

## The Fix (Good Version)

A `VendingState` interface. Each state class (`IdleState`, `HasCoinState`, `DispensingState`) owns the behavior for that state only. Transitions are made explicit by calling `vm.setState(new NextState())`.

```java
vm.insertCoin();   // IdleState → HasCoinState
vm.pressButton();  // HasCoinState → DispensingState → dispense() → IdleState
```

## Key Takeaway

State turns a long conditional in each method into one focused class per state. Each class is small, testable, and independently changeable.
