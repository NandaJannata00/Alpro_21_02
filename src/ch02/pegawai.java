package ch02;

public class pegawai {
    String nik, nama, jabatan;
    boolean isAktif;

    public String getNik(){
        return nik;
    }

    public String getnama(){
        return nama;
    }

    public String getjabatan(){
        return jabatan;
    }

    public Boolean getIsAktif(){
        return isAktif;
    }

    public void cetak () {
        System.out.println("NIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Status : " + isAktif);
    }

}
