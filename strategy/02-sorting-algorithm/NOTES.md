# 02 - Sorting Algorithm

## The Problem (Bad Version)

All sorting algorithms live inside `Sorter` as private methods, selected by a `switch`:

```java
switch (algorithm) {
    case "BUBBLE": bubbleSort(array); break;
    case "SELECTION": selectionSort(array); break;
    ...
}
```

- Adding Merge Sort requires editing `Sorter` — one big class grows forever
- Can't swap algorithm for an existing instance
- Can't test each algorithm independently without touching `Sorter`

## The Fix (Good Version)

Each algorithm is its own class implementing `SortStrategy`:

```java
Sorter sorter = new Sorter(new BubbleSort());
sorter.sort(data);

sorter.setStrategy(new QuickSort()); // swap at runtime
sorter.sort(data);
```

`Sorter` delegates entirely to the strategy — it contains zero sorting logic itself.

## Key Takeaway

Strategy is the textbook fix for bloated classes with switch/if that select behavior. Each variant becomes its own focused class, testable and extendable in isolation.
