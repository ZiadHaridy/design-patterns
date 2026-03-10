# 03 - Discount Calculator

## The Problem (Bad Version)

Each discount type is a branch inside `calculate()`:

```java
} else if (discountType.equals("PERCENTAGE_10")) { ... }
} else if (discountType.equals("PERCENTAGE_20")) { ... }
```

Notice `PERCENTAGE_10` and `PERCENTAGE_20` are almost identical — duplicated logic. Adding `PERCENTAGE_15` means yet another `else if`.

## The Fix (Good Version)

`PercentageDiscount` takes the percentage as a constructor argument — **one class handles all percentages**:

```java
new PercentageDiscount(10)   // 10%
new PercentageDiscount(20)   // 20%
new PercentageDiscount(50)   // 50%  — no new class needed!
```

Each discount is self-contained with its own state and logic. `PriceCalculator` just calls `strategy.apply(price)`.

## Key Takeaway

Strategy shines when algorithm variants share structure but differ in parameters or logic. Concrete strategies can hold **state** (like `percentage`, `amount`), making them more powerful than simple if/else branches.
