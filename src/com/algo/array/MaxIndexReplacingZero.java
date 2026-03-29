package com.algo.array;

public class MaxIndexReplacingZero {



    private static void findIndex(int[] A) {

        int maxIndex = -1;
        int maxCount = Integer.MIN_VALUE;

        int previousIndex = -1;
        int currentCount = 0;

        for (int i=0; i<A.length; i++) {

            if (A[i] >0) {
                currentCount ++;
            } else {
                currentCount = i-previousIndex;
                previousIndex = i;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxIndex = previousIndex;
            }
        }
        System.out.println("==Index:"+maxIndex+" Count:"+maxCount);
    }



    public static void main(String[] args) {
        int[] A = { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };

        findIndex(A);
    }
}
