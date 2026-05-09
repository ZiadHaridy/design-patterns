# 03 - Restaurant Order

## The Problem (Bad Version)

`Waiter.takeOrder()` calls the `Cook` directly and synchronously. There's no way to queue a table's full order and send it at once, or cancel before it reaches the kitchen.

## The Fix (Good Version)

Orders are `Command` objects collected in a list (`orderSlip`). The waiter queues them, and `sendOrdersToKitchen()` fires them all at once. `cancelOrders()` simply clears the list before any `execute()` is called.

## Key Takeaway

Command enables **deferred execution** — collect requests now, fire them later. Job queues, background task runners, and transactional batches all use this capability.
