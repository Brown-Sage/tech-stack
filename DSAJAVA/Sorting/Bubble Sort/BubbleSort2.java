import java.util.Arrays;
public class BubbleSort2 {
    public static void BubbleSort2(int[] array){
        for(int i = array.length - 1;i > 0; i--){
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
        int[] Farray = {5,4,6,8,3,2};
        BubbleSort2(Farray);
        System.out.println(Arrays.toString(Farray));
    }
}
