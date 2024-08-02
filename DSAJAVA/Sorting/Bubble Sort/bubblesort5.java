import java.util.Arrays;
public class bubblesort5 {
    public static void Bubblesort(int[] array){
        for(int i = array.length-1;i > 0;i--){
            for(int j = 0; j < i; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arrays = {2,5,3,4,6,1};
        Bubblesort(arrays);
        System.out.println(Arrays.toString(arrays));
    }
}
