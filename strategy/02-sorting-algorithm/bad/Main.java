/**
 * BAD: Algorithm is locked in at construction time as a string.
 * Can't switch algorithm for the same Sorter instance.
 */
public class Main {

    public static void main(String[] args) {
        int[] data1 = {64, 34, 25, 12, 22, 11, 90};
        new Sorter("BUBBLE").sort(data1);

        System.out.println();

        int[] data2 = {64, 34, 25, 12, 22, 11, 90};
        new Sorter("SELECTION").sort(data2);

        System.out.println();

        int[] data3 = {64, 34, 25, 12, 22, 11, 90};
        new Sorter("QUICK").sort(data3);

        System.out.println();
        System.out.println("Problem: Adding 'MERGE' sort requires editing Sorter.");
        System.out.println("All algorithms are tangled in one class.");
    }
}
