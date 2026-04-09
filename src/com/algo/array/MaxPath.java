package com.algo.array;

public class MaxPath {


    private static int findMaxPathSum(int[] X, int[] Y) {

        int sum_x = 0;
        int sum_y = 0;
        int sum = 0;

        int i = 0, j = 0;

        while (i < X.length && j < Y.length) {

            while (i < X.length -1 && X[i] == X[i+1]) {
                sum_x += X[i];
                i++;
            }

            while (j < Y.length -1 && Y[j] == Y[j+1]) {
                sum_y += Y[j];
                j++;
            }

            if (X[i] < Y[j]) {
                sum_x += X[i];
                i++;
            } else if (X[i] > Y[j]) {
                sum_y += Y[j];
                j++;
            } else {
                sum += Math.max(sum_x, sum_y) + X[i];
                i++;
                j++;

                sum_x = 0;
                sum_y = 0;
            }

        }

        while (i < X.length) {
            sum_x += X[i];
            i++;
        }
         while (j<Y.length) {
             sum_y += Y[j];
             j++;
         }
         sum += Integer.max(sum_x, sum_y);
         return sum;

    }

    public static void main(String[] args) {
        int[] X = { 1,3,5};
        int[] Y = { 2,4,6 };

        System.out.println("The maximum sum is " + findMaxPathSum(X, Y));
    }
}
