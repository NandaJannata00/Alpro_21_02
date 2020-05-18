package ch03;

public class PembagiTerkecil {
    int nilai, tambah ;
    public void Pembagi(int nilai, int tambah){
        System.out.println("faktor dari " + nilai +" adalah : ");
        for (int i = 0; i <= nilai; i++){
            tambah++;
            if (nilai % tambah == 0){
                System.out.print(tambah + " ");
            }
        }

    }
}
