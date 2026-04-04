package com.algo.array;

import java.util.Arrays;

public class IncreasingSubsequence {

    private static int findLength(int[] A) {

        if (A.length ==0 || A.length ==1) {
            return A.length;
        }

        int[] L = new int[A.length];
        L[0] = 1;

        for (int i=1;i<A.length; i++) {

            for (int j=0;j<i;j++) {
                if (A[j] < A[i] && L[j] > L[i]) {
                    L[i] = L[j];
                }
            }
            L[i] ++;
        }

        return Arrays.stream(L).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };

        System.out.print("The length of the LIS is " + findLength(arr));

    }
}
