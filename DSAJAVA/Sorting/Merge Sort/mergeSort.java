import java.util.Arrays;

public class mergeSort {
    // Method to merge two sorted arrays into one sorted array
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] mixed = new int[arr1.length + arr2.length]; // Array to hold the merged result
        int index = 0, i = 0, j = 0;

        // Merge elements from both arrays in sorted order
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mixed[index] = arr1[i];
                i++;
            } else {
                mixed[index] = arr2[j];
                j++;
            }
            index++;
        }

        // Add remaining elements from arr1, if any
        while (i < arr1.length) {
            mixed[index] = arr1[i];
            index++;
            i++;
        }

        // Add remaining elements from arr2, if any
        while (j < arr2.length) {
            mixed[index] = arr2[j];
            index++;
            j++;
        }

        return mixed;
    }

    // Method to perform merge sort on an array
    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array; // Base case: if the array has only one element

        int midIndex = array.length / 2; // Find the midpoint
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex)); // Recursively sort the left half
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length)); // Recursively sort the right half

        return merge(left, right); // Merge the sorted halves
    }

    public static void main(String[] args) {
        int[] originalArray = {3, 1, 4, 2}; // Example array to be sorted

        int[] sortedArray = mergeSort(originalArray); // Perform merge sort

        // Print the original and sorted arrays
        System.out.println("\nOriginal Array: " + Arrays.toString(originalArray));
        System.out.println("\nSorted Array: " + Arrays.toString(sortedArray));

        /*
            EXPECTED OUTPUT:
            ----------------
            Original Array: [3, 1, 4, 2]
            Sorted Array: [1, 2, 3, 4]
        */
    }
}

