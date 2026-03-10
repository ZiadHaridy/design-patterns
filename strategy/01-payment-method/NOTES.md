# 01 - Payment Method

## The Problem (Bad Version)

All payment logic lives inside one method using `if/else`:

```java
public void processPayment(String paymentType, double amount) {
    if (paymentType.equals("CREDIT_CARD")) { ... }
    else if (paymentType.equals("PAYPAL")) { ... }
    else if (paymentType.equals("CRYPTO")) { ... }
}
```

- Adding `"BANK_TRANSFER"` means **editing** `OrderService` — breaking the Open/Closed Principle
- String-based dispatch is error-prone (typos cause runtime crashes)
- Impossible to test each payment path in isolation cleanly

## The Fix (Good Version)

Each payment method is a separate class implementing `PaymentStrategy`:

```java
service.setPaymentStrategy(new CreditCardPayment("1234..."));
service.processPayment(120.00);
```

`OrderService` never changes — it just calls `strategy.pay(amount)`. Adding a new method = adding one new class.

## Key Takeaway

Strategy replaces **conditional branching** with **polymorphism**. Instead of asking "what type is this?", you just call the method on the object — the right behavior is already baked in.
