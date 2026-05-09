# 02 - Traffic Light

## The Problem (Bad Version)

`next()` has one `if/else` per state. As more states are added (Flashing, Night-mode), the chain grows. Each state's actions (duration, sound alerts) would be interleaved in the same method.

## The Fix (Good Version)

`RedState`, `GreenState`, `YellowState` each define `display()` and `next()`. Each one knows exactly which state comes next.

```java
// TrafficLight delegates:
light.display();  → state.display()
light.next();     → state.next(this) → this.setState(new GreenState())
```

## Key Takeaway

State machines with fixed, well-defined transitions (traffic lights, vending machines, elevator controllers) map perfectly to the State pattern.
