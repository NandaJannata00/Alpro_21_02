package ch04;
import java.util.Arrays;

public class l {
    public static void main( String [] args) {
        int[] array1 = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] % 2 == 0 && array1[i - 1] % 2 == 0) {
                System.out.print("Jumlah dari " + array1[i - 1] + " dan " + array1[i] + " = ");
                System.out.println(array1[i - 1] + array1[i] + " ");
            }
        }
    }

}
