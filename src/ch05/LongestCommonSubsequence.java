package ch05;

public class LongestCommonSubsequence {
    int lcs( char[] A, char[] B, int m, int n )
    {
        if (m == 0 || n == 0)
            return 0;
        if (A[m-1] == B[n-1])
            return 1 + lcs(A, B, m-1, n-1);
        else
            return max(lcs(A, B, m, n-1), lcs(A, B, m-1, n));
    }
    int max(int a, int b)
    {
        return (a > b)? a : b;
    }
    public static void main(String[] args)
    {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "ADZRA";
        String s2 = "FAKHIRA";
        char[] A=s1.toCharArray();
        char[] B=s2.toCharArray();
        int m = A.length;
        int n = B.length;
        System.out.println("Panjangnya adalah" + " " +
                lcs.lcs( A, B, m, n ) );
    }
}
