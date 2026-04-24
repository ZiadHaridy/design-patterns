# 04 - Vehicle Factory

## The Problem (Bad Version)

`Dealership.deliver(String type)` switches on a string and inlines every vehicle's description. Each new model means another branch.

## The Fix (Good Version)

A `Vehicle` interface with `Car`, `Truck`, `Motorcycle` implementations. The abstract `Dealership` owns the workflow; each subclass overrides `createVehicle()`.

```java
new CarDealership().deliver();
new TruckDealership().deliver();
```

## Key Takeaway

When the same multi-step process should be reusable across different concrete products, Factory Method extracts the "what to instantiate" into a single overridable method.
