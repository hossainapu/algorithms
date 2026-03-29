package com.algo.array;

import java.util.*;

public class EquilibriumIndex {

    private static Set<Integer> findIndices(List<Integer> nums) {

        Set<Integer> indices = new HashSet<>();
        if (nums == null || nums.isEmpty()) {
            return indices;
        }
        int[] leftSum = new int[nums.size()];
        leftSum[0] = 0;

        for (int i=1;i<nums.size(); i++) {
            leftSum[i] = leftSum[i-1] + nums.get(i-1);
        }

        int right = 0;

        for (int i=nums.size()-1; i>=0; i--) {

            if (right == leftSum[i]) {
                indices.add(i);
            }

            right += nums.get(i);
        }

        return indices;
    }

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(5, 1, -4, 5, -4, -2, 3, -1, 2);
        System.out.println("Array:"+findIndices(nums));

    }
}
