# 05 - Navigation Route

## The Problem (Bad Version)

The routing mode is a string parameter and all logic is inside `buildRoute()`:

```java
nav.buildRoute("Home", "Office", "DRIVING");
nav.buildRoute("Home", "Office", "WALKING");
```

- Can't add cycling without editing `Navigator`
- Can't switch mode on an existing `Navigator` instance
- All routing logic — unrelated to each other — lives in one method

## The Fix (Good Version)

Each transport mode is a strategy. The user switches at runtime:

```java
Navigator nav = new Navigator(new DrivingRoute());
nav.buildRoute("Home", "Office");

nav.setRouteStrategy(new CyclingRoute()); // user picks a new mode
nav.buildRoute("Home", "Office");
```

`CyclingRoute` was added as a new class — `Navigator` was **never touched**.

## Key Takeaway

This is exactly how Google Maps works internally — each transport mode (driving, walking, transit, cycling) is a different routing strategy that the UI swaps at runtime. Strategy makes the system **open for extension** and **closed for modification**.
