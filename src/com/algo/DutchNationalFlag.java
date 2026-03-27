package com.algo;

import java.util.Arrays;

public class DutchNationalFlag {

    public static void dutchNationalFlag(int[] arr) {

        int pivot = 1;

        int start = 0;
        int mid = 0;
        int end = arr.length -1;

        while (mid <= end) {

            if (arr[mid] < pivot) {
                int temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;
                mid ++;
                start ++;

            } else if (arr[mid] == pivot) {
                mid ++;
            } else {
                int temp = arr[end];
                arr[end] = arr[mid];
                arr[mid] = temp;
                end --;
            }
            System.out.println("Step Array:"+Arrays.toString(arr));
        }
        System.out.println("Array:"+Arrays.toString(arr));
    }

    public static void main(String[] args) {
        dutchNationalFlag(new int[] { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 });
    }
}
