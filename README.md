# Software Component Design - Design Patterns

A practical guide to **Gang of Four (GoF) Design Patterns** for 3rd year Computer Science students.

## How This Repo Is Organized

Each design pattern has its own folder. Inside each pattern folder, you'll find:

```
pattern-name/
├── README.md                        # Pattern overview, UML, and when to use it
├── 01-use-case-name/
│   ├── bad/                         # Code WITHOUT the pattern (problematic design)
│   │   └── ClassName.java
│   ├── good/                        # Code WITH the pattern (clean design)
│   │   └── ClassName.java
│   └── NOTES.md                     # Explanation of what's wrong and how the pattern fixes it
├── 02-another-use-case/
│   ├── bad/
│   ├── good/
│   └── NOTES.md
└── ...
```

## Patterns Covered

### Creational Patterns

| Pattern                 | Description                          | Status |
| ----------------------- | ------------------------------------ | ------ |
| [Singleton](singleton/) | Ensure a class has only one instance | Done   |

### Structural Patterns

| Pattern                 | Description                                        | Status |
| ----------------------- | -------------------------------------------------- | ------ |
| [Decorator](decorator/) | Attach additional responsibilities dynamically     | Done   |

> More patterns will be added throughout the course.

## How to Study

1. **Read the pattern README** to understand the concept and UML diagram
2. **Read the bad code first** - try to identify the problems yourself
3. **Read the NOTES.md** to confirm your understanding of the issues
4. **Read the good code** to see how the pattern solves those problems
5. **Try it yourself** - modify the examples or create your own

## Prerequisites

- Java 17+
- Basic understanding of OOP (inheritance, polymorphism, encapsulation)
- Familiarity with UML class diagrams

## Compile & Run

Each Java file can be compiled and run independently:

```bash
javac ClassName.java
java ClassName
```

## References

- _Design Patterns: Elements of Reusable Object-Oriented Software_ - Gang of Four (GoF)
- _Head First Design Patterns_ - Freeman & Robson
- _Effective Java_ - Joshua Bloch
