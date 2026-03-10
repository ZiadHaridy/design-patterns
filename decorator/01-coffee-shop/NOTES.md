# 01 - Coffee Shop

## The Problem (Bad Version)

Every combination of coffee + toppings requires its own class:

```
Coffee
CoffeeWithMilk
CoffeeWithSugar
CoffeeWithMilkAndSugar
CoffeeWithWhippedCream          ← need to add
CoffeeWithMilkAndWhippedCream   ← need to add
...
```

With **N toppings**, you need up to **2^N** classes. This is called **class explosion**.

## The Fix (Good Version)

Use the Decorator pattern:

```java
Beverage order = new WhippedCreamDecorator(
                     new SugarDecorator(
                         new MilkDecorator(new SimpleCoffee())));
```

Each decorator wraps the previous one and adds its behavior:
- `SimpleCoffee.getCost()` → 5.0
- `MilkDecorator.getCost()` → wrapped.getCost() + 1.5 → 6.5
- `SugarDecorator.getCost()` → wrapped.getCost() + 0.5 → 7.0
- `WhippedCreamDecorator.getCost()` → wrapped.getCost() + 2.0 → 9.0

Adding a new topping = **1 new class**. All combinations are handled automatically.

## Key Takeaway

Decorator eliminates class explosion by composing behaviors at **runtime** instead of defining every combination at **compile time**.
