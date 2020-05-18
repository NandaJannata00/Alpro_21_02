package ch03;
import java.util.*;
public class BilPrima {
    int bilangan;
    Boolean bilPrima;

    public void CekInput(int bilangan1){
        Scanner Input = new Scanner(System.in);
        while (bilangan1 <= 1) {
            System.out.print("\n\n Nilai harus lebih dari 1 \n Masukkan nilai batas atas : ");
            bilangan1 = Input.nextInt();
        }
    }

    public void Tentukanprima(int bilangan1, boolean bilprima){
        for (int i = bilangan1; i <= bilangan1; i++) {
            bilprima = false;
            if (i == 2) {
                bilprima = true;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        bilprima = false;
                        System.out.println("bukan bilangan prima");
                        break;
                    }else{
                        bilprima = true;
                    }
                }
            }

            if (bilprima){
                System.out.println("termasuk bilangan prima");
            }

        }
    }
}
