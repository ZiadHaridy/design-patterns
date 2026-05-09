# 01 - Remote & Device

## The Problem (Bad Version)

Each Remote-Device combination is a separate class. With 2 remote types and 2 device types that's 4 classes — fine today. But 3 remote types × 3 device types = 9 classes. The number grows multiplicatively.

## The Fix (Good Version)

Two independent hierarchies:
- **Abstraction** hierarchy: `RemoteControl` → `AdvancedRemoteControl`
- **Implementor** hierarchy: `Device` → `Tv`, `Radio`

The remote holds a `Device` reference (the bridge). You combine them freely:

```java
new RemoteControl(new Tv());
new AdvancedRemoteControl(new Radio());
new AdvancedRemoteControl(new Tv());   // new combo for free
```

Adding `Projector` = one class. Adding `VoiceRemote` = one class. No combinations needed.

## Key Takeaway

Bridge prevents the **M × N class explosion** that occurs when two dimensions of variation are handled through inheritance alone. The "bridge" is the composition reference from Abstraction to Implementor.
