import java.util.Arrays;

/**
 * BAD EXAMPLE: Sorting algorithm chosen via switch inside the sorter.
 *
 * Problems:
 *  1. Adding a new algorithm (e.g., HeapSort) requires modifying this class.
 *  2. All algorithms live in one bloated class.
 *  3. Can't swap algorithms at runtime once the Sorter is constructed.
 */
public class Sorter {

    private String algorithm;

    public Sorter(String algorithm) {
        this.algorithm = algorithm;
    }

    public void sort(int[] array) {
        switch (algorithm) {
            case "BUBBLE":
                System.out.println("Sorting with Bubble Sort...");
                bubbleSort(array);
                break;
            case "SELECTION":
                System.out.println("Sorting with Selection Sort...");
                selectionSort(array);
                break;
            case "QUICK":
                System.out.println("Sorting with Quick Sort...");
                Arrays.sort(array); // simulated
                System.out.println("(Quick Sort simulated via Arrays.sort)");
                break;
            default:
                throw new IllegalArgumentException("Unknown algorithm: " + algorithm);
        }
        System.out.println("Result: " + Arrays.toString(array));
    }

    private void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
