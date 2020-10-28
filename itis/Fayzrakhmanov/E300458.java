package itis.Fayzrakhmanov;

import java.util.Scanner;
public class E300458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int E = (int)(1e+9) + 7;
        // int n = sc.nextInt();
        // int k = sc.nextInt();
        int n = 6; int k = 4;
        int[] arr = new int[n+1];
        for (int i = n; i > 0; i--) {
            arr[i] = 1;
            for (int j = i + i; j < n+1; j += i) {
                arr[i] = (arr[i] + (arr[j] + k - 1)) % E;
            }
        }
        long sum  = 0;
        for (int i = 1; i < n+1; i++) {
            sum = (sum + arr[i]) % E;
        }
        System.out.println(sum);
    }
}
