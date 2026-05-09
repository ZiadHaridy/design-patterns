# 05 - Task Queue

## The Problem (Bad Version)

`Scheduler.runAll()` switches on string task names. Every new task type requires editing the scheduler.

## The Fix (Good Version)

`Task` interface. Any task just implements `run()`. `TaskQueue` is a generic invoker — enqueue, flush, or clear without knowing what the tasks do.

```java
queue.enqueue(new EmailTask());
queue.enqueue(new ReportTask());
queue.flush();   // runs both
```

## Key Takeaway

Job queues, background workers, thread pools, and message consumers (Kafka, RabbitMQ) are all just generic invokers that fire Command objects. The queue never changes; only new command classes are added.
