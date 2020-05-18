package ch02;

import java.util.Date;

public class ObjectProduk {
    public static void main(String[] args) {
        produk x1 = new produk();
        produk x2 =  new produk();

        x1.nama = "pepsodent";
        x1.barcode = "4233322223";
        x1.harga = 8900;
        x1.tanggalkadaluarsa = new Date(2020,7,21);

        x2.nama = "Kat-Kat";
        x2.barcode = "4233322332";
        x2.harga = 14500;
        x2.tanggalkadaluarsa = new Date(2020,8,5);

        System.out.println("==Produk");
        System.out.println(x1.nama + " (" + x1.barcode + ")");
        System.out.println("Harga: Rp." + x1.harga);
        System.out.println("EXP: " + x1.tanggalkadaluarsa.toString() + "\n");

        System.out.println("==Produk");
        System.out.println(x2.nama + " (" + x2.barcode + ")");
        System.out.println("Harga: Rp." + x2.harga);
        System.out.println("EXP: " + x2.tanggalkadaluarsa.toString());


    }
}
