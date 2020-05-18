package ch04;

import java.util.Arrays;

public class c {
    public static void main(String[] args) {

        int [] array1 = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.print("[");
        for (int i = 0; i < array1.length; i++){
            if (array1[i] % 2 != 0 ){
                System.out.print(array1[i] + " ");
            }
        }
        System.out.println("]");
    }
}
