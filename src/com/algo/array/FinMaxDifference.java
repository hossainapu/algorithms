package com.algo.array;

public class FinMaxDifference {

    private static int findMaxDifference(int[] A) {

        //{ 2, 7, 9, 5, 1, 3, 5 }
        int maxDifference = -1;

        int min = Integer.MAX_VALUE;
        for (int i=0; i< A.length-1; i++) {
            min = Math.min(min, A[i]);
            if (min < A[i+1]) {
                maxDifference = Math.max(A[i+1] - min, maxDifference);
            }
        }

        return maxDifference;
    }


    public static void main(String[] args) {
        System.out.println(findMaxDifference(new int[] { 2, 7, 9, 5, 1, 3, 5 }));
    }
}
