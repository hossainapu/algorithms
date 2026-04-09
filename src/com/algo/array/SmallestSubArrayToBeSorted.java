package com.algo.array;

public class SmallestSubArrayToBeSorted {


    private static Pair<Integer, Integer> findSubArray(int[] A) {

        if (A.length <2) {
            return null;
        }

        int leftIndex = -1;
        int rightIndex = -1;

        int maxSoFar = Integer.MIN_VALUE;

        for (int i=0; i< A.length; i++) {
            if (maxSoFar < A[i]) {
                maxSoFar = A[i];
            }
            if (maxSoFar > A[i]) {
                rightIndex = i;
            }
        }

        int minSoFar = Integer.MAX_VALUE;
        for (int i = A.length -1; i>=0; i--) {
            if (minSoFar > A[i]) {
                minSoFar = A[i];
            }
            if (minSoFar < A[i]) {
                leftIndex = i;
            }
        }
        if (leftIndex == -1 && rightIndex == -1) {
            return null;
        }

        return Pair.of(leftIndex, rightIndex);
    }

    public static void main(String[] args) {
        System.out.println(findSubArray(new int[] { 1, 1, 0,1,1,0,1,1,1,1}));
    }
}
