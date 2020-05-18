package ch04;
import java.util.Arrays;
public class f {
    public static void main(String[] args) {
        int [] array1 = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int [] array2 = new int [array1.length];
        for (int i = 0; i < array1.length; i++){
            if (array1[i] % 2 != 0 ){
                array2[i] = array1[i];
            }
        }
        Arrays.sort(array2);
        System.out.print("[");
        for (int j = 0; j < array2.length; j++){
            if(array2[j] != 0){
                if (j == 8){
                    continue;
                }
                System.out.print(array2[j] + " ");
            }
        }
        System.out.print("]");
    }
}
