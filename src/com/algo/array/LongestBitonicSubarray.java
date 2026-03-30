package com.algo.array;

import java.util.*;

public class LongestBitonicSubarray {

    private static List<Integer> findMaxSubArrayLength(List<Integer> nums) {

        List<Integer> tobeRetuned = new ArrayList<>();
        int previousMin = 0;
        int maxLength = Integer.MIN_VALUE;
        int start = Integer.MAX_VALUE;
        int end = -1;
        int currentLength = 1;
        boolean foundMax = false;

        for (int i=1; i<nums.size(); i++) {
            if (nums.get(i-1) < nums.get(i)) {
                if (foundMax) {
                    if (maxLength < currentLength) {
                        start = previousMin;
                        end = i;
                    }
                    if (end == -1) {
                        end = 0;
                    }
                    maxLength = Math.max(maxLength, currentLength);
                    previousMin = i-1;
                    currentLength =2;
                    foundMax = false;
                } else {
                    currentLength++;
                }
            } else if (nums.get(i-1) > nums.get(i)){
                foundMax = true;
                currentLength ++;
            } else {
                foundMax = true;
            }
        }

        //END with last element is alternating or last element is completing sub array
        if (maxLength < currentLength) {
            start = previousMin;
            end = start + currentLength;

            maxLength = currentLength;
        }

        if (maxLength == Integer.MIN_VALUE) {
            start = 0;
            end = nums.size()-1;
        }
        for (int i=start; i<end; i++) {
            tobeRetuned.add(nums.get(i));
        }
        return tobeRetuned;
    }

    public static void main(String[] args) {
        System.out.print(findMaxSubArrayLength(Arrays.asList(3, 5, 8, 4, 5, 9, 10, 8, 5, 3, 4)));
        //-4, -2, 7, 1
    }
}
