package com.algo.array;

public class StockProfit {


    private static int getProfit(int[] A) {

        int profit = 0;

        for (int i=0;i<A.length; i++) {

            while (i < A.length-1 && A[i] > A[i+1] ) {
                i++;
            }

            int buyPrice = A[i];
            i++;

            while (i < A.length-1 && A[i] <= A[i+1]) {
                i++;
            }

            if (i < A.length) {
                int sellPrice = A[i];
                profit += sellPrice - buyPrice;
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        System.out.println(getProfit(new int[] {10, 8, 6, 5, 4, 2}));
    }
}
