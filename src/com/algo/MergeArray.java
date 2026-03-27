package com.algo;

import java.util.Arrays;

public class MergeArray {

    private static void merge(int[] first, int[] second) {

        int firstLength = first.length;
        int secondLength = second.length;

        for (int i =0;i<firstLength;i++) {

            int secondPosition = 0;

            if (first[i] > second[secondPosition]) {
                int temp = first[i];
                first[i] = second[secondPosition];
                second[secondPosition] = temp;
                while (secondPosition < secondLength-1) {
                    if (second[secondPosition] > second[secondPosition +1]) {
                        int x = second[secondPosition];
                        second[secondPosition] = second[secondPosition+1];
                        second[secondPosition+1] = x;
                    }

                    secondPosition ++;
                }
            }
        }
        System.out.println("First:"+ Arrays.toString(first) + "Second:"+Arrays.toString(second));
    }



    public static void main(String[] args) {
        merge(new int[]{ 1, 4, 7, 8, 10 }, new int[] { 2, 3, 9 });
    }

}
