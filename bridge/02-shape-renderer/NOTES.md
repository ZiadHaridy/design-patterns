# 02 - Shape Renderer

## The Problem (Bad Version)

Each shape-renderer pair is its own class: `VectorCircle`, `RasterCircle`, `VectorSquare`, `RasterSquare`. Adding a third shape (Triangle) or a third renderer (OpenGL) multiplies the class count.

## The Fix (Good Version)

- **Abstraction**: `Shape` → `Circle`, `Square`  
- **Implementor**: `Renderer` → `VectorRenderer`, `RasterRenderer`

```java
new Circle(0, 0, 10, new VectorRenderer()).draw();
new Circle(0, 0, 10, new RasterRenderer()).draw();
```

M shapes × N renderers collapses to M + N classes.

## Key Takeaway

Bridge is the answer to "I have two orthogonal dimensions of variation and I'm about to create a class for every pair." The bridge reference (Abstraction → Implementor) eliminates the explosion.
