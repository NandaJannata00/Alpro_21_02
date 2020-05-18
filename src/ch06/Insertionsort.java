package ch06;

public class Insertionsort {
    private int[] data;

    public Insertionsort(int n) {
        this.data = new int[n];
    }

    public void setData(int index, int value) {
        if (index >= 0 && index < this.data.length) {
            this.data[index] = value;
        }
    }

    public void printData() {
        String out = "Data Array = ";
        for (int a= 0; a<this.data.length; a++) {
            out += this.data[a] + ", ";
        }
        System.out.println(out);
    }

    private void Change(int i, int j) {
        int temp = this.data[i];
        this.data[i] = this.data[j];
        this.data[j] = temp;
    }

    public void Sort() {
        for (int a = 1; a < this.data.length; a++) {
            int b = a;
            while (b>0 && this.data[b] < this.data[b - 1]) {
                Change(b,b-1);
                b--;
            }
        }
    }

    public static void main(String[] args) {
        Insertionsort is = new Insertionsort(13);

//        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        is.setData(0, 82);
        is.setData(1, 12);
        is.setData(2, 41);
        is.setData(3, 38);
        is.setData(4, 19);
        is.setData(5, 26);
        is.setData(6, 9);
        is.setData(7, 48);
        is.setData(8, 20);
        is.setData(9, 55);
        is.setData(10, 8);
        is.setData(11, 32);
        is.setData(12, 3);

        is.printData();
        is.Sort();
        is.printData();
    }
}


