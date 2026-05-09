# 03 - Message Sender

## The Problem (Bad Version)

`UrgentEmailMessage`, `NormalEmailMessage`, `UrgentSmsMessage`, `NormalSmsMessage` are four independent classes. Adding Slack = two more classes; adding another priority level = two more classes again.

## The Fix (Good Version)

- **Abstraction**: `Message` → `UrgentMessage`, `NormalMessage`  
- **Implementor**: `MessageSender` → `EmailSender`, `SmsSender`

```java
new UrgentMessage("Server down!", new SmsSender()).send();
```

Adding any channel or any priority is one class each, independent of the other side.

## Key Takeaway

Notification systems with multiple message types and multiple delivery channels are a natural Bridge use case.
