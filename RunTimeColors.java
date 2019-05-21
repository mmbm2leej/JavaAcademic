import java.util.Random;

public class runTimeColors extends ArrayList1 {

    public static int[] Array_Of_20;

    public static int[] RandomIntegerArrayGenerator(int size) {
        int Array[];
        Array = new int[size]; // Creates the new array
        for (int i = 0; i < size; i++) {
            Array[i] = (int) (Math.random() * 1000); // Uses "Random" Library to create Array[i] of int type, chosen up
                                                     // to 1000
        }
        return Array;
    }

    public static void main(String args[]) {
        Array_Of_20 = RandomIntegerArrayGenerator(20);
        System.out.println(" ");
        System.out.println("--------------------THE 20 ELEMENTS----------------------");

        // Insertion Sort Array Of 20 Introduced
        System.out.println("Sorted Arrays And Times For 20 Elements");

        // Merge Sort For 20 Element Array
        MainSortClass Merge_Array_Of_20 = new MainSortClass(Array_Of_20, 20);
        Merge_Array_Of_20.mergeSortandTimer();
        System.out.println(" ");
        System.out.println(" ");

        // COMPARISON TIME
        System.out.println("Times of the Sorting Methods");
        System.out.println("*** 20 Element Sorting Times***");
        System.out.println("Merge Sort (Milliseconds): " + Merge_Array_Of_20.time);

        System.out.println("");
    }
}

// Main Class That Sets The Array
class MainSortClass {

    int[] Array;
    int[] temp_A;
    int size;
    long time;

    public MainSortClass(int array[], int new_size) {
        size = new_size;
        Array = array.clone(); // Sets the Main Array used for Sorting, duplicates for use
        time = 0;
    }

    public void mergesort(int indexLow, int indexHigh) {
        if (indexLow < indexHigh) // If indexLow is not greater than or equal to indexHigh, or !(p>=r)
        {
            int middle = (indexLow + indexHigh) / 2; // Sets the midpoint middle of the given value
            mergesort(indexLow, middle);
            mergesort(middle + 1, indexHigh);
            mergeParts(indexLow, middle, indexHigh);
        }
    }

    // Program to sort the elements of the subarray A[indexLow...indexHigh] in
    // increasing order
    public void mergeParts(int indexLow, int middle, int indexHigh) {

        int[] temp_A = Array.clone();

        int i = indexLow;
        int j = middle + 1;
        int k = indexLow;

        while (i <= middle && j <= indexHigh) {
            if (temp_A[i] <= temp_A[j]) {
                Array[k] = temp_A[i];
                i++;
            } else {
                Array[k] = temp_A[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            Array[k] = temp_A[i];
            k++;
            i++;
        }
    }

    public void print() // Outputs All Values
    {
        for (int i = 0; i < Array.length; i++) {
            System.out.print("  Element [" + (i + 1) + "]: " + Array[i]);
        }
    }

    public void mergeSortandTimer() {
        final long startTime = System.nanoTime();
        mergesort(0, Array.length - 1);
        final long endTime = System.nanoTime();
        final long total = (endTime - startTime);
        System.out.println("**Merge Sort for Array with " + Array.length + " elements**");
        System.out.println("The elapsed time from the start of the program to the end is: " + total + " NanoSeconds");
        time = total;
        print();
    }
}
