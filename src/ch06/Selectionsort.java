package ch06;

public class Selectionsort {
    private int[] data;

    public Selectionsort(int n) {
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
        for (int a = 0; a < this.data.length; a++) {
            int min = a;
            for (int b = a; b < this.data.length; b++) {
                if (this.data[b] < this.data[min]) {
                    min = b;
                }
            }
            Change(a, min);
        }
    }

    public static void main(String[] args) {
        Selectionsort ss = new Selectionsort(13);

        ss.setData(0, 82);
        ss.setData(1, 12);
        ss.setData(2, 41);
        ss.setData(3, 38);
        ss.setData(4, 19);
        ss.setData(5, 26);
        ss.setData(6, 9);
        ss.setData(7, 48);
        ss.setData(8, 20);
        ss.setData(9, 55);
        ss.setData(10, 8);
        ss.setData(11, 32);
        ss.setData(12, 3);

        ss.printData();
        ss.Sort();
        ss.printData();
    }

}


