package com.algo.array;

import java.util.Arrays;
import java.util.Random;

public class FisherYatesShuffle {


    private static void shuffle(int[] A) {

        if (A.length == 0) {
            return;
        }

        Random random = new Random();
        for (int i=A.length-1; i>=0;i--) {

            int index = random.nextInt(i+1);

            int temp = A[index];
            A[index] = A[i];
            A[i] = temp;

        }

    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6 };

        shuffle(A);

        System.out.println("Array"+ Arrays.toString(A));
    }
}
