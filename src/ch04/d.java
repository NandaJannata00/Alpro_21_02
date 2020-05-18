package ch04;

public class d {
    public static void main(String[] args) {

        int [] array1 = {82,12,41,38,19,26,9,48,20,5,8,32,3};
        for(int i = 0; i < array1.length; i++){
            if (array1[i] % 3 == 0){
                System.out.print(array1[i] + " ");
            }
        }

    }
}
