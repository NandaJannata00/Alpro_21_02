package ch02;

public class ObjectPegawai {
    public static void main(String[] args) {
        pegawai pg1 = new pegawai();
        pegawai pg2 = new pegawai();

        pg1.nik = "424";
        pg1.nama = "Siska";
        pg1.jabatan = "Staff";
        pg1.isAktif = true;

        pg2.nik = "124";
        pg2.nama = "cici";
        pg2.jabatan = "Administrasi";
        pg2.isAktif = true;

        pg1.cetak();
        System.out.println("=============");
        pg2.cetak();
     }
}
