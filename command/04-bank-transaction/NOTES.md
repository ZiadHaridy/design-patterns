# 04 - Bank Transaction

## The Problem (Bad Version)

`BankService.transfer()` does the debit and credit inline with no rollback. If the credit side fails after the debit, the money is gone.

## The Fix (Good Version)

`TransferTransaction` is a command that captures the "from", "to", and "amount". `rollback()` reverses the transfer. `TransactionManager` keeps an ordered log.

```java
manager.run(new TransferTransaction(alice, bob, 200));
manager.rollbackLast();  // money back to Alice
```

## Key Takeaway

Database transactions, saga patterns, and compensation-based workflows in microservices use the same idea: encapsulate an action and its inverse so they can be applied or reversed atomically.
