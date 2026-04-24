# 01 - Document Creator

## The Problem (Bad Version)

`DocumentApp.run(String type)` mixes the shared open/edit/save workflow with the decision of which document to instantiate. Each new format adds another `if/else` branch and another concrete reference.

## The Fix (Good Version)

`DocumentApp` is abstract. Its `run()` method orchestrates the workflow but calls a **factory method** `createDocument()` whose implementation is up to the subclass:

```java
public final void run() {
    Document doc = createDocument();   // factory method
    doc.open();
    doc.edit();
    doc.save();
}
```

`PdfApp` and `WordApp` override `createDocument()` to choose their concrete product. The workflow code never names a concrete class.

## Key Takeaway

Factory Method puts the "what to create" decision in a subclass while the parent class owns the "how to use it" workflow. Adding a new product type doesn't change the workflow.
