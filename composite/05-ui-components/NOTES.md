# 05 - UI Components

## The Problem (Bad Version)

`Window` and `Panel` are independent classes that each maintain a `children` list, and the renderer must `instanceof` every container type. Adding `ScrollPanel` means another branch in `render()`.

## The Fix (Good Version)

`UIComponent` is the leaf-or-container abstraction. Leaves (`Button`, `Label`) implement it directly. Containers extend a shared `Container` base that does the recursive rendering — so `Window` and `Panel` only differ in what they print as their "kind".

```java
window.add(header).add(body).add(footer);
window.render("");   // recurses into every nested container
```

A new container type is one subclass of `Container`. The renderer needs no changes.

## Key Takeaway

Every modern UI toolkit (Swing, AWT, Qt, the DOM) is a Composite tree. Layout managers, event propagation, and "render the world" all rely on uniform leaf/container behavior.
