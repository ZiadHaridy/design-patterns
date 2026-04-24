# 04 - Menu System

## The Problem (Bad Version)

`MenuItem` and `SubMenu` are unrelated. Rendering and price queries each walk the tree with `instanceof`. Nesting submenus deeper means yet more recursion in the renderer.

## The Fix (Good Version)

`MenuComponent` is the shared abstraction. `MenuItem` is a leaf, `Menu` is a composite that holds `MenuComponent` children — so submenus naturally nest.

```java
Menu drinks = new Menu("Drinks")
    .add(new MenuItem("Coffee", 3.5))
    .add(new Menu("Hot")
        .add(new MenuItem("Espresso", 3.0)));
```

Rendering and `cheapest()` recurse polymorphically. Adding a new node type (e.g. `Promotion`) requires no edits to existing classes.

## Key Takeaway

Menus, navigation trees, and any UI hierarchy with submenus are textbook Composite. The same code renders one item, one section, or the whole menu.
