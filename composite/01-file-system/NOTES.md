# 01 - File System

## The Problem (Bad Version)

`FileNode` and `FolderNode` are unrelated types. Every traversal looks like:

```java
if (node instanceof FileNode) { ... }
else if (node instanceof FolderNode) { ... }
```

Adding a `Symlink` type means going back into `totalSize()`, `print()`, and any future operation to bolt on another `else if`. The client also has to know which type it's holding.

## The Fix (Good Version)

A single `FileSystemNode` abstraction with two concrete types:

- `File` (Leaf) — knows its own size
- `Folder` (Composite) — holds children and asks each one for its size

```java
Folder root = new Folder("root");
root.add(new File("README.md", 4))
    .add(new Folder("src").add(new File("Main.java", 12)));

root.totalSize();   // recursion happens via polymorphism
root.print("");
```

A new type (e.g. `Symlink`) is one class implementing `totalSize()` and `print()`. Existing code does not change.

## Key Takeaway

Composite turns recursive `instanceof` walks into ordinary polymorphic calls. The client treats one file and a whole tree the same way.
