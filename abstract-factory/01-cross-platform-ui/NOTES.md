# 01 - Cross-Platform UI

## The Problem (Bad Version)

Every widget is selected with the same `if (platform.equals("windows"))` chain. The platform string is repeated everywhere, and nothing prevents mixing a Mac button with a Windows checkbox — that mix would look broken at runtime.

## The Fix (Good Version)

Two product interfaces (`Button`, `Checkbox`) and matching variants per platform. A `GuiFactory` interface produces both. Each `ConcreteFactory` only knows how to build its own family.

```java
GuiFactory factory = isWindows ? new WindowsFactory() : new MacFactory();
new App(factory).renderForm();
```

`App` only references abstractions — concrete classes are never named in client code. The compiler now enforces that every widget in a given `App` comes from the same family.

## Key Takeaway

When products must come from a consistent set (look-and-feel, theme, locale), Abstract Factory makes the consistency a structural property of the code rather than a developer convention.
