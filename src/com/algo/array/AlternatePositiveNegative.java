package com.algo.array;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class AlternatePositiveNegative {


    private static void alter(List<Integer> A) {

        if (A.size() <2) {
            return;
        }

        Stack<Integer> positive = new Stack<>();
        Stack<Integer> negative = new Stack<>();

        for (int num : A) {
            if (num >=0) {
                positive.push(num);
            } else {
                negative.push(num);
            }
        }

        int k = 0;
        for (int i=0;i<A.size(); i+=2) {
            if (!positive.isEmpty()) {
                int pos = positive.peek();
                if (pos != 0) {
                    A.set(k,positive.pop());
                    k++;
                }
            }
            if (!negative.isEmpty()) {
                int neg = negative.peek();
                if (neg != 0) {
                    A.set(k,negative.pop());
                    k++;
                }
            }
        }
        while (!positive.isEmpty()) {
            A.set(k, positive.pop());
            k++;
        }
        while (!negative.isEmpty()) {
            A.set(k,negative.pop());
            k++;
        }
    }


    public static void main(String[] args) {

        Integer A[] =  {9, -3, 5, -2, -8, -6 };
        alter(Arrays.asList(A));
        System.out.println("Array:"+ Arrays.toString(A));
    }
}
