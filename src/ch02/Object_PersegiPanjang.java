package ch02;

public class Object_PersegiPanjang {
    public static void main(String[] args) {
        PersegiPanjang y = new PersegiPanjang();
        y.panjang = 16;
        y.lebar = 15;

        System.out.println("Luas Persegi Panjang = " + y.luas());
    }
}
