package ch02;
import java.util.Date;

public class obat {
    String barcode, nama;
    Date tanggalKadaluarsa;
    double harga;

    public String getBarcode(){
        return barcode;
    }

    public String getNama(){
        return nama;
    }

    public Date getTanggalKadaluarsa(){
        return tanggalKadaluarsa;
    }

    public double getHarga(){
        return harga;
    }
}
