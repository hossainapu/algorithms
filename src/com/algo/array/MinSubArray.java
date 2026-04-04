package com.algo.array;

public class MinSubArray {

    private static int findSubArray(int[] A, int target) {

        if (A.length ==0) {
            return 0;
        }
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int len = 0;

        int sumSoFar = 0;

        for (int low = 0; low < A.length ; low++) {

            while ( sumSoFar <= target && right < A.length) {
                sumSoFar += A[right];
                len++;
                right ++;
            }

            if (sumSoFar > target) {
                minLength = Integer.min(len, minLength);
            }
            sumSoFar -= A[low];
            len --;
        }
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }
        return minLength;
    }

    public static void main(String[] args) {
        System.out.println(findSubArray(new int[] {2, 2, 1}, 4));
    }
}
