package ch04;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int Bilangan;
        Boolean kondisi = false;

        int [] array1 = {82,12,41,38,19,26,9,48,20,5,8,32,3};

        System.out.println("\n==Mencari sebuah angka di Array");
        System.out.print("masukkan bilangan yang dicari = ");
        Bilangan = Input.nextInt();
        for (int i = 0; i < array1.length; i++) {
            if (Bilangan == array1[i]) {
                System.out.println(Bilangan + " termasuk bilangan array");
                kondisi = true;
                break;
            }
        }
        if (kondisi == false){
            System.out.println("Bilangan " + Bilangan + " tidak ada di dalam Array");
        }
    }
}
