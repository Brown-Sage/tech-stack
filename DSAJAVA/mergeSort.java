import java.util.Arrays;

/**
 * mergeSort
 */
public class mergeSort {

    public static int[] merge(int[] array1 , int[] array2){
        int[] mixed = new int[array1.length+array2.length];
        int index = 0;
        int i = 0;
        int j= 0;
        while(i < array1.length && j< array2.length){
            if(array1[i] < array2[j]){
                mixed[index] = array1[i];
                index++;
                i++;
            }else{
                mixed[index] = array2[j];
                index++;
                j++;
            }
        }
            while(i < array1.length){
            mixed[index] = array1[i];
            index++;
            i++;
        }
            while(j < array2.length){
            mixed[index] = array2[j];
            index++;
            j++;
        }
        return mixed;
    }
    public static void main(String[] args) {
        int[] array1 = {1,5,3,7};
        int[] array2 = {4,2,8,6};
        System.out.println(Arrays.toString(merge(array1,array2)));
    }
}