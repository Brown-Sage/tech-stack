import java.util.Arrays;

public class merge1 {                                       //This is not the original merge sort it is a helper function for the  merge sort
    public static int[] merge2(int[] arr1, int[]arr2){
        int[] mixed = new int[arr1.length+arr2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length){
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
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        System.out.println(Arrays.toString(merge2(arr1,arr2)));
    }
}
