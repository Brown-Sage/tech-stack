import java.util.Arrays;
public class bubblesort3 {
    public static void bubbleSort3(int[] array){
        for(int i = array.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,7};
        bubbleSort3(nums);
        System.out.println(Arrays.toString(nums));
    }
}
