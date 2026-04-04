package com.algo.array;

import java.util.ArrayList;
import java.util.List;

public class DistinctCombination {

    private static void findCombination(int[] A, int start, int length, List<List<Integer>> subArrays, List<Integer> out) {

        if (A.length ==0 || A.length < length) {
            return;
        }

        if (length ==0) {
            subArrays.add(new ArrayList<>(out));
            return;
        }

        for (int i = start; i<A.length; i++) {
            out.add(A[i]);
            findCombination(A, i +1, length -1, subArrays, out);
            out.remove(out.size() -1);
        }
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3 };
        int k = 2;

        List<List<Integer>> subArrays = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        findCombination(A, 0, k, subArrays, out);

        for (int i =0;i<subArrays.size(); i++) {
            System.out.print(subArrays.get(i));
            if (i != subArrays.size()-1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
