package ch02;

import java.util.Date;

public class ObjectObat {
    public static void main(String[] args) {
        obat x1 = new obat();
        obat x2 = new obat();
        obat x3 = new obat();

        x1.barcode = "9348399348";
        x1.nama = "Paramax";
        x1.harga = 6000;
        x1.tanggalKadaluarsa = new Date (2021,10,20);


        x2.barcode = "4563391121";
        x2.nama = "Badrex";
        x2.harga = 7500;
        x2.tanggalKadaluarsa = new Date (2021,11,6);


        x3.barcode = "9086409673";
        x3.nama = "konidin";
        x3.harga = 2500;
        x3.tanggalKadaluarsa = new Date (2021,7,2);

        System.out.println("==Obat");
        System.out.println(x1.nama + " (" + x1.barcode + ")");
        System.out.println("Harga: Rp." + x1.harga);
        System.out.println("EXP: " + x1.tanggalKadaluarsa.toString() + "\n");

        System.out.println("==Obat");
        System.out.println(x2.nama + " (" + x2.barcode + ")");
        System.out.println("Harga: Rp." + x2.harga);
        System.out.println("EXP: " + x2.tanggalKadaluarsa.toString() + "\n");

        System.out.println("==Obat");
        System.out.println(x3.nama + " (" + x3.barcode + ")");
        System.out.println("Harga: Rp." + x3.harga);
        System.out.println("EXP: " + x3.tanggalKadaluarsa.toString());
    }
}
