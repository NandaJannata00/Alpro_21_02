package ch06;

public class Bubblesort {

    static void Bubblesort(int[] angka) {
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j <angka.length - 1; j++) {
                if (angka[j] > angka[j + 1]) {
                    int temp = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + ", ");
        }
        System.out.println("");
        Bubblesort(angka);
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + ", ");
        }
    }
}
