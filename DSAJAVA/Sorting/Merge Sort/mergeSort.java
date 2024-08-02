import java.util.Arrays;

public class mergeSort {
    public static int[] merge(int[] arr1, int[] arr2){
        int[] mixed = new int [arr1.length + arr2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while(i < arr1.length && j <arr2.length){
            if(arr1[i] < arr2[j]){
                mixed[index] = arr1[i];
                index++;
                i++;
            }else{
                mixed[index] = arr2[j];
                index++;
                j++;
            }
        }
        while(i < arr1.length){
            mixed[index] = arr1[i];
            index++;
            i++;
        }
        while(j < arr2.length){
            mixed[index] = arr2[j];
            index++;
            j++;
        }
        return mixed;
    }
    
    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;

        int midIndex = array.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(left, right);
    }


    public static void main(String[] args) {

        int[] originalArray = {3,1,4,2};

        int [] sortedArray = mergeSort(originalArray);

        System.out.println( "\nOriginal Array: " + Arrays.toString( originalArray ) );

        System.out.println( "\nSorted Array: " + Arrays.toString( sortedArray ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            Original Array: [3, 1, 4, 2]
            
            Sorted Array: [1, 2, 3, 4]

         */

    }
}
