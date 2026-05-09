# 04 - Furniture Factory

## The Problem (Bad Version)

`FurnitureShop.displayLivingRoom(style)` re-checks the style for every piece. Mixing styles is a one-line typo away.

## The Fix (Good Version)

`Chair`, `Sofa`, and `Table` are abstract products. `FurnitureFactory` produces all three. Each style has its own concrete factory.

```java
new FurnitureShop(new ModernFurnitureFactory()).displayLivingRoom();
new FurnitureShop(new VictorianFurnitureFactory()).displayLivingRoom();
```

The shop just iterates products and shows them — it never names a style again after construction.

## Key Takeaway

This is the canonical "themed product family" use case. Any catalog where items must match in style (UI themes, document templates, render skins) is the same shape.
