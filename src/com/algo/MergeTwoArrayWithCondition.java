package com.algo;

import java.util.Arrays;

public class MergeTwoArrayWithCondition {

    private static void merge(int[] X, int[] Y) {

        int k =X.length-1;
        for (int i=X.length -1; i>=0; i--) {
            if (X[i] > 0) {
                X[k] = X[i];
                k--;
            }
        }
        for (int i = k; i>=0;i--) {
            if (X[i] >=0) {
                X[i] = 0;
            }
        }

        for (int i=Y.length-1; i>=0;i--) {
            if (Y[i] == 0){
                continue;
            }

            for (int j=X.length-1; j>=0; j--) {
                if (X[j] == 0) {
                    X[j] = Y[i];

                    for (int m=j; m<X.length-1; m++) {
                        if (X[m] > X[m+1]) {
                            int temp = X[m];
                            X[m] = X[m+1];
                            X[m+1] = temp;
                        }
                    }

                    break;
                }
            }
        }
        System.out.println("Array:["+ Arrays.toString(X)+"]");
    }

    public static void main(String[] args) {
        merge(new int[] { 0, 2, 0, 3, 0, 5, 6, 0, 0}, new int[] { 1, 8, 9, 10, 15 });
    }
}
