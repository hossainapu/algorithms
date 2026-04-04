package com.algo.array;

public class MaxLISLength {

    private static int findMax(int[] A, int current, int previous) {

        if (current == A.length) {
            return 0;
        }

        int exc = findMax(A, current +1, previous);

        int inc = 0;
        if (previous ==-1 || A[current] > A[previous] ) {
            inc = 1 + findMax(A, current +1, current);
        }

        return Math.max(inc, exc);
    }

    public static void main(String[] args) {
        int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };

        System.out.print("The length of the LIS is "
                + findMax(arr, 0, -1));
    }
}
