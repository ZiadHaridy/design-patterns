/**
 * GOOD: The Sorter doesn't know or care about the algorithm.
 * Swap the strategy at runtime — no code changes needed.
 */
public class Main {

    public static void main(String[] args) {
        Sorter sorter = new Sorter(new BubbleSort());

        int[] data1 = {64, 34, 25, 12, 22, 11, 90};
        sorter.sort(data1);
        System.out.println();

        // Switch to Selection Sort at runtime
        sorter.setStrategy(new SelectionSort());
        int[] data2 = {64, 34, 25, 12, 22, 11, 90};
        sorter.sort(data2);
        System.out.println();

        // Switch to Quick Sort
        sorter.setStrategy(new QuickSort());
        int[] data3 = {64, 34, 25, 12, 22, 11, 90};
        sorter.sort(data3);

        System.out.println();
        System.out.println("Success: Adding MergeSort = one new class, zero changes to Sorter.");
    }
}
