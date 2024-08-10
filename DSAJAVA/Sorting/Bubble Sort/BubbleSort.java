import java.util.Arrays;

public class BubbleSort {
    // Method to perform bubble sort on an array
    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                // Swap elements if they are in the wrong order
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example array to be sorted
        int[] myarray = {2, 4, 1, 8, 5, 3, 9};
        bubbleSort(myarray);  // Sort the array
        System.out.println(Arrays.toString(myarray));  // Print the sorted array
    }
}

