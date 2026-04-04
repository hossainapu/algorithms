package com.algo.array;

import java.util.Arrays;

public class ContinuousMaxSumSubArray {


    private static int maxSum(int[] A) {

        if (A.length == 0) {
            return 0;
        }
        int maxSum = Arrays.stream(A).max().getAsInt();
        if (Arrays.stream(A).max().getAsInt() <0) {
            return maxSum;
        } else {
            maxSum = 0;
        }

        int maxEndingHere = 0;

        for (int i =0; i< A.length;i++) {
            maxEndingHere +=A[i];
            maxEndingHere = Math.max(maxEndingHere, 0);
            maxSum = Math.max(maxSum, maxEndingHere);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSum(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
