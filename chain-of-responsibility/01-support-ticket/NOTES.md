# 01 - Support Ticket

## The Problem (Bad Version)

All escalation logic lives in one `if/else`:

```java
if (severity.equals("LOW")) { /* L1 handles */ }
else if (severity.equals("MEDIUM")) { /* L1 fails, L2 handles */ }
else if (severity.equals("HIGH")) { /* L1 fails, L2 fails, L3 handles */ }
```

The escalation path is **duplicated** — the "L1 can't handle it" message is repeated in MEDIUM and HIGH branches. Adding L4 means editing this method.

## The Fix (Good Version)

Each support level is a handler in a chain:

```java
l1.setNext(l2).setNext(l3);
l1.handle("HIGH");
// L1: can't handle → escalate
// L2: can't handle → escalate
// L3: handles it!
```

Each handler only knows about **its own** responsibility and how to pass to the next.

## Key Takeaway

Chain of Responsibility models **escalation** naturally. The request travels through the chain until someone handles it — just like real-world support ticket systems.
