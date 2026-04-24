# 05 - Payment Processor

## The Problem (Bad Version)

`Checkout.pay(method, amount)` knows about every payment method and inlines validate/charge/receipt for each. Adding ApplePay or Crypto means more branches.

## The Fix (Good Version)

A `PaymentProcessor` interface and concrete `CreditCardProcessor` / `PayPalProcessor`. The abstract `Checkout` runs the workflow; subclasses choose the processor.

```java
new CreditCardCheckout().pay(49.99);
new PayPalCheckout().pay(19.95);
```

## Key Takeaway

When you have a stable workflow (validate → charge → receipt) but pluggable concrete dependencies, Factory Method is the right level of indirection. For a *family* of related products (e.g. a payment processor + a fraud check + a settlement adapter that must match), reach for Abstract Factory instead.
