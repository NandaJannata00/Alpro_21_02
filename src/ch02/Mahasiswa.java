package ch02;

public class Mahasiswa {
    String nim, nama, alamat, hp;

    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String alamat(){
        return alamat;
    }

    public String gehp(){
        return hp;
    }

    public void cetak() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Hp : " + hp);
    }
}
