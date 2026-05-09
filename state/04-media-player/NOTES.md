# 04 - Media Player

## The Problem (Bad Version)

`play()`, `pause()`, and `stop()` each contain an `if/else` for every state. The state is a string. Logic for "resume from pause" vs "start from stopped" lives in the same `play()` method.

## The Fix (Good Version)

`StoppedState`, `PlayingState`, `PausedState` each define exactly what each button does from that state:

```java
// In PausedState:
play()  → setState(PlayingState) + "Resumed"
stop()  → setState(StoppedState) + "Stopped"
pause() → "Already paused"
```

## Key Takeaway

Any object with a finite set of modes where the same action means something different depending on the current mode (music players, streaming apps, game characters) maps cleanly to State.
