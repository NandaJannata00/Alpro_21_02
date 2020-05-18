package ch03;

import java.util.*;

public class ObjectNilaiTinggi2 {
    public static void main(String[] args) {
        AlproNilaiTinggi2 bilangan = new AlproNilaiTinggi2();

        Scanner InputBilangan = new Scanner(System.in);

        System.out.print("Masukkan Bilangan 1 = ");
        bilangan.y1 = InputBilangan.nextInt();

        System.out.print("Masukkan Bilangan 2 = ");
        bilangan.y2 = InputBilangan.nextInt();

        System.out.print("Masukkan Bilangan 3 = ");
        bilangan.y3 = InputBilangan.nextInt();

        if (bilangan.y1 > bilangan.y2){
            if (bilangan.y1 > bilangan.y3){
                System.out.println("Bilangan yang terbesar adalah " + bilangan.y1);
            }
        }else if (bilangan.y2 > bilangan.y3){
            if (bilangan.y2 > bilangan.y1){
                System.out.println("Bilangan yang terbesar adalah " + bilangan.y2);
            }
        }else  {
            System.out.println("Bilangan yang terbesar adalah " + bilangan.y3);
        }

    }
}








