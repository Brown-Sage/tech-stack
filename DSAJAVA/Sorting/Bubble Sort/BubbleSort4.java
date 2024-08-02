import java.util.Arrays;

public class BubbleSort4 {
     public static void bubblesort4(int[] array){      
        for(int i = array.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    ;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] nums = {2,4,3,1,6};
        bubblesort4(nums);
        System.out.println(Arrays.toString(nums));
    }
}
