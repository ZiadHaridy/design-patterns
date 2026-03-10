# 04 - Text Formatter

## The Problem (Bad Version)

Each combination of text transformations requires a class:
- `UpperCaseProcessor`
- `TrimAndUpperCaseProcessor`
- `TrimAndUpperCaseAndBracketsProcessor` ← keeps growing

Transformations can't be reordered or combined flexibly.

## The Fix (Good Version)

Each transformation is a decorator:

```java
TextComponent pipeline = new BracketDecorator(
                             new UpperCaseDecorator(
                                 new TrimDecorator(new PlainText())));

pipeline.process("   hello world   ");
// → trim → "hello world"
// → upper → "HELLO WORLD"
// → brackets → "[HELLO WORLD]"
```

Each decorator takes the result of the inner one and applies its own transformation.

## Key Takeaway

Decorator builds a **processing pipeline** where each step is independent and reusable. You can add, remove, or reorder steps at runtime without modifying existing code.
