# 05 - Payment Gateway

## The Problem (Bad Version)

Each order type × gateway combination is its own class. Adding a new gateway multiplies the required classes by the number of order types.

## The Fix (Good Version)

- **Abstraction**: `Order` → `RegularOrder`, `SubscriptionOrder`  
- **Implementor**: `PaymentGateway` → `PayPalGateway`, `StripeGateway`

```java
new SubscriptionOrder(9.99, new StripeGateway()).checkout();
```

Any new gateway or order type adds exactly one class.

## Key Takeaway

E-commerce systems with multiple order types and multiple payment providers are a Bridge in the wild. Swap the gateway at runtime (e.g. A/B test PayPal vs Stripe) without changing the order logic.
