package ch04;

import java.util.Arrays;

public class h {
    public static void main(String[] args) {
        int [] array1 = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int nilai = 0;

        for (int i = 0; i < array1.length; i++){
            nilai = nilai + array1[i];
        }

        System.out.println("Hasil dari penjumlahan Array\n" + Arrays.toString(array1)+ " \nadalah " + nilai);

    }
}
