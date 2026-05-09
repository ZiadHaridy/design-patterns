# 01 - Stock Market

## The Problem (Bad Version)

`StockMarket` instantiates every observer directly — `StockDisplay`, `StockLogger`, `EmailAlertService`. Adding a `MobileApp` or a `WebSocket` feed means editing the market class. There's no way to subscribe or unsubscribe at runtime.

## The Fix (Good Version)

A `StockObserver` interface. Observers register themselves:

```java
market.attach(display);
market.attach(email);
market.detach(email);   // unsubscribe at runtime
```

`StockMarket` loops through its list and calls `onPriceChange()`. It never knows the concrete type of any observer.

## Key Takeaway

Observer decouples the publisher from its consumers. New data consumers plug in without touching the source.
