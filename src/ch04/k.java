package ch04;

public class k {
    public static void main (String [] args){
        int[] array1 = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("[");
        for (int i = 1; i < array1.length; i++){
            if ( array1[i] > array1[i-1]){
                System.out.print(array1[i] + " ");
            }
        }
        System.out.println("]");
    }

}
