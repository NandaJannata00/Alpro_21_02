package ch03;

import java.util.*;

public class ObjectNilaiTertinggi1 {
    public static void main(String[] args) {
        AlproNilaiTertinggi1 bilangan = new AlproNilaiTertinggi1();

        Scanner InputNilai = new Scanner(System.in);
        System.out.print("Masukan bilangan 1 = ");
        bilangan.x1 = InputNilai.nextInt();
        System.out.print("Masukan bilangan 1 = ");
        bilangan.x2 = InputNilai.nextInt();

        if (bilangan.x1 > bilangan.x2) {
            System.out.println("Bilangan Tertinggi adalah " + bilangan.x1);
            }else{
            System.out.println("Bilangan Tertinggi adalah " + bilangan.x2);
        }
    }
}
