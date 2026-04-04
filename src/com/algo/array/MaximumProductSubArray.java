package com.algo.array;

public class MaximumProductSubArray {

    private static int findMaxProduct(int[] A) {


        if (A.length ==0) {
            return 0;
        }
        if (A.length ==1) {
            return A[0];
        }

        int maxEnding = A[0], minEnding = A[0];
        int maxProduct = -1;

        for (int i=1; i<A.length; i++) {

            int temp = maxEnding;

            maxEnding = Math.max(A[i], Math.max(A[i] * maxEnding , minEnding * A[i]));
            minEnding = Math.min(A[i] , Math.min(A[i] * temp, A[i] * minEnding));

            maxProduct = Math.max(Integer.max(maxEnding, minEnding), maxProduct);
        }


        return maxProduct;
    }

    public static void main(String[] args) {
        int[] A = { -6, 4, -5, 8, -10, 0, 8 };

        System.out.print("The maximum product of a subarray is " + findMaxProduct(A));
    }
}
