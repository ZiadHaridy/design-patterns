import java.util.Arrays;

/**
 * ConcreteStrategy — Selection Sort algorithm.
 */
public class SelectionSort implements SortStrategy {

    @Override
    public void sort(int[] array) {
        System.out.println("Sorting with Selection Sort...");
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) minIdx = j;
            }
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
        System.out.println("Result: " + Arrays.toString(array));
    }
}
