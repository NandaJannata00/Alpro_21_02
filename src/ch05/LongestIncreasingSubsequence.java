package ch05;

public class LongestIncreasingSubsequence {
    static int max_ref;
    static int _lis(int arr[], int n)
    {
        if (n == 1)
            return 1;
        int res, max_ending_here = 1;
        for (int i = 1; i < n; i++) {
            res = _lis(arr, i);
            if (arr[i - 1] < arr[n - 1] && res + 1 > max_ending_here)
                max_ending_here = res + 1;
        }
        if (max_ref < max_ending_here)
            max_ref = max_ending_here;
        return max_ending_here;
    }
    static int lis(int arr[], int n)
    {
        max_ref = 1;
        _lis(arr, n);
        return max_ref;
    }
    public static void main(String args[])
    {
        int arr[] = { 10, 11, 1, 2, 9, 8, 19, 5, 18, 17 };
        int n = arr.length;
        System.out.println("Panjangnya adalah " + lis(arr, n) + "\n");
    }
}
