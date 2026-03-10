import java.util.Arrays;

/**
 * ConcreteStrategy — Quick Sort algorithm.
 */
public class QuickSort implements SortStrategy {

    @Override
    public void sort(int[] array) {
        System.out.println("Sorting with Quick Sort...");
        quickSort(array, 0, array.length - 1);
        System.out.println("Result: " + Arrays.toString(array));
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }
}
