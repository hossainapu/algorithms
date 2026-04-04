package com.algo.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargetNumberFromArray {

    private static void findLargest(List<Integer> A) {
        Collections.sort(A, (a, b) -> (String.valueOf(b) + a).compareTo(String.valueOf(a)+b));
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<A.size(); i++) {
            sb.append(A.get(i));
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        findLargest(Arrays.asList(10, 68, 97, 9, 21, 12));
    }
}
