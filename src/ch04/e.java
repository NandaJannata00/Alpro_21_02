package ch04;
import java.util.*;

public class e {
    public static void main(String[] args) {
        int[] array1 = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Array yang memiliki angka 2  = [ ");
        for (int i  = 0; i < array1.length; i++){
            if (array1[i] % 10 == 2 || array1[i] / 10 == 2) {
                System.out.print(array1[i] + " ");
            }
        }
        System.out.print("]");
    }
}
