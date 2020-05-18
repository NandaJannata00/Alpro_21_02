package ch04;

import java.util.Arrays;

public class i {
    public static void main(String[] args) {
        int [] array1 = {82,12,41,38,19,26,9,48,20,5,8,32,3};
        int[] nilai = new int [array1.length];
        int selisih [] = new int [array1.length];

        for (int i = 0; i < array1.length; i++){
            if (i == 12){
                break;
            }
            nilai[i] = array1[i] - array1[i + 1];
        }
        selisih = Arrays.copyOfRange(nilai,0,12);
        System.out.println(Arrays.toString(selisih));
    }
}
