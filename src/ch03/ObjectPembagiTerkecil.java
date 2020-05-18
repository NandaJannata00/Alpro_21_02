package ch03;
import java.util.*;
public class ObjectPembagiTerkecil {
    public static void main(String[] args) {
        int nilai, tambah = 2;
        Scanner Input = new Scanner(System.in);
        System.out.print("masukkan bilangan = ");
        nilai = Input.nextInt();

        PembagiTerkecil pembagiterkecil = new PembagiTerkecil();

        pembagiterkecil.Pembagi(nilai,tambah);

    }


}
