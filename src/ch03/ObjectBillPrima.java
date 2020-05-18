package ch03;
import java.util.*;
public class ObjectBillPrima {
    public static void main(String[] args) {
        int bilangan1;
        boolean bilprima;
        Scanner Input = new Scanner(System.in);
        BilPrima prima = new BilPrima();

        System.out.print("masukkan nilai = ");
        bilangan1 = Input.nextInt();

        prima.CekInput(bilangan1);
        prima.Tentukanprima(bilangan1,false);
    }
}
