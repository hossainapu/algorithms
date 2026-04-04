package com.algo.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ExactSubArraySum {


    private static boolean isExists(int[] A, int target) {

        if (A.length ==0) {
            return false;
        }

        int windowSum = 0;
        int high = 0;

        for (int low = 0; low < A.length; low++) {

            while (windowSum < target && high < A.length) {
                windowSum += A[high];
                high++;
            }

            if (target == windowSum) {
                System.out.println(Arrays.toString(Arrays.copyOfRange(A, low, high)));
                return true;
            }

            windowSum -= A[low];
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isExists(new int[] { 2, 6, 0, 9, 7, 3, 1, 4, 1, 10 }, 23));
    }
}
