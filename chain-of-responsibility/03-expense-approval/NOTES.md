# 03 - Expense Approval

## The Problem (Bad Version)

Approval thresholds are hardcoded in a chain of `if/else`:

```java
if (amount <= 100) { /* Manager approves */ }
else if (amount <= 1000) { /* Director approves */ }
else if (amount <= 10000) { /* VP approves */ }
```

Changing the Manager's limit from $100 to $200 requires editing this class. Adding a CEO level also requires editing it.

## The Fix (Good Version)

Each approver is a handler with its own limit:

```java
manager.setNext(director).setNext(vp);
manager.approve("Alice", 5000);
// Manager: can't approve → Director: can't approve → VP: approved!
```

Each `Approver` subclass simply sets its title and limit — the chain logic is in the base class.

## Key Takeaway

This is a classic example where the "threshold" naturally maps to a chain. Each handler has a **single responsibility** (its approval limit), and the chain manages the escalation automatically. This pattern is used in real procurement and HR systems.
