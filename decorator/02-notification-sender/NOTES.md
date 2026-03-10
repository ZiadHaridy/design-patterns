# 02 - Notification Sender

## The Problem (Bad Version)

Each combination of notification channels requires its own class:

```
Notifier (email)
SMSNotifier
SlackNotifier
EmailAndSMSNotifier
EmailAndSlackNotifier       ← need to add
SMSAndSlackNotifier         ← need to add
EmailAndSMSAndSlackNotifier ← need to add
```

With inheritance, you can't **combine** behaviors — you can only replace or hardcode them.

## The Fix (Good Version)

Each notification channel is a decorator that **adds** its behavior on top of the wrapped notifier:

```java
Notifier allChannels = new SlackDecorator(
                           new SMSDecorator(
                               new EmailNotifier()));
allChannels.send("Alert!");
// Output: EMAIL, SMS, then SLACK
```

The key is `super.send(message)` — each decorator first delegates to the wrapped notifier, then adds its own channel.

## Key Takeaway

Decorator is perfect when you need to **stack** multiple behaviors. Each decorator adds one responsibility, and they can be combined in any order at runtime.
