# 03 - Graphic Shapes

## The Problem (Bad Version)

A `Group` is a different type from individual shapes, so `draw()` and `area()` must keep checking:

```java
if (s instanceof Circle) { ... }
else if (s instanceof Rectangle) { ... }
else if (s instanceof Group) { for (...) area(member); }
```

Nested groups recurse manually, and a new shape (e.g. `Polygon`) means yet another `else if` everywhere.

## The Fix (Good Version)

`Graphic` is the shared abstraction. `Circle` and `Rectangle` are leaves; `ShapeGroup` is a composite that holds `Graphic` children — including other `ShapeGroup`s.

```java
ShapeGroup scene = new ShapeGroup("scene")
    .add(person)               // group inside group
    .add(new Rectangle(...));

scene.draw();   // recursion is automatic
scene.area();
```

## Key Takeaway

Drawing tools, document layouts, and any nestable visual structure are textbook Composite. A "select all and resize" operation is just one polymorphic call on the root.
