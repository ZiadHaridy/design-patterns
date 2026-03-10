# 05 - Pizza Order

## The Problem (Bad Version)

Toppings are managed with boolean flags inside the `Pizza` class:

```java
new Pizza(true, true, false, true); // cheese, pepperoni, no mushrooms, olives
```

Problems:
- **Adding a topping** (e.g., Jalapenos) requires modifying `Pizza` — violates the **Open/Closed Principle**
- **Double toppings** (extra cheese) are impossible
- **Cost logic** is a chain of `if` statements that grows with every topping

## The Fix (Good Version)

Each topping is a decorator that wraps a `Pizza`:

```java
Pizza order = new MushroomTopping(
                  new PepperoniTopping(
                      new CheeseTopping(new PlainPizza())));
// Plain Pizza + Cheese + Pepperoni + Mushrooms -> $14.5
```

- Adding a new topping = **1 new class**, no modifications to existing code
- Double toppings work naturally: `new CheeseTopping(new CheeseTopping(pizza))`
- Each topping's cost is self-contained

## Key Takeaway

Decorator respects the **Open/Closed Principle**: open for extension (add new topping classes), closed for modification (never touch `PlainPizza`). This is especially valuable when the number of optional features can grow over time.
