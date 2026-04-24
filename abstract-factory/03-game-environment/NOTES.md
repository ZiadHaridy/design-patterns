# 03 - Game Environment

## The Problem (Bad Version)

`Game.playRound(era)` checks the era at every step. There's no enforcement against spawning a Knight and equipping it with a laser rifle — the bug, if it ever appears, is silent.

## The Fix (Good Version)

`Character` and `Weapon` are abstract products. `WorldFactory` produces both. Each concrete factory (`MedievalWorldFactory`, `SciFiWorldFactory`) only ever produces its own family.

```java
new Game(new MedievalWorldFactory()).playRound();   // knight + sword, guaranteed
```

## Key Takeaway

Abstract Factory turns a "please remember to pick consistent items" rule into a structural one. The compiler does the policing for you.
