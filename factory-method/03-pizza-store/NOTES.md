# 03 - Pizza Store

This is the canonical Factory Method example from Head First Design Patterns.

## The Problem (Bad Version)

A single `PizzaStore.orderPizza(region, type)` hardcodes every region. The shared steps (prepare → bake → cut → box) are tangled with the region-specific creation. New regions force edits in this central method.

## The Fix (Good Version)

`PizzaStore` is abstract. `orderPizza(type)` is fixed:

```java
public final Pizza orderPizza(String type) {
    Pizza pizza = createPizza(type);   // factory method
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
}
```

`NyPizzaStore` and `ChicagoPizzaStore` override `createPizza(type)` to return their regional pizzas. The Chicago variants override `cut()` to cut into squares — local variation lives in the product, not the workflow.

## Key Takeaway

When a workflow is shared but the "what gets created" varies by subclass (region, environment, tenant), Factory Method is the cleanest fit.
