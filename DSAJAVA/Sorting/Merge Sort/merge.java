import java.util.Arrays;

public class merge {
    // Method to merge two sorted arrays into one sorted array
    public static int[] merge0(int[] arr1, int[] arr2) {
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

    public static void main(String[] args) {
        // Example arrays to be merged
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        
        // Print the merged result
        System.out.println(Arrays.toString(merge0(arr1, arr2)));
    }
}

