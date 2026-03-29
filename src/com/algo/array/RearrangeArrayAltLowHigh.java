package com.algo.array;

import java.util.Arrays;
import java.util.List;

public class RearrangeArrayAltLowHigh {


    /*
    * Rearrange the array such that every second element is greater that its previous and next element.
    * */
    private static void rearrange(List<Integer> A) {

        if (A.size() <3) {
            return;
        }

        for (int i=1;i<A.size(); i+=2) {

            if (A.get(i-1) > A.get(i)) {

                int temp = A.get(i-1);
                A.set(i-1, A.get(i));
                A.set(i, temp);
            }

            if (i+1 < A.size() &&  A.get(i) < A.get(i+1)) {
                int temp = A.get(i);
                A.set(i, A.get(i+1));
                A.set(i+1, temp);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] A = {4,3,2,1};

        rearrange(Arrays.asList(A));
        System.out.println(Arrays.toString(A));
    }
}
