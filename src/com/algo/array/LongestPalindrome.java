package com.algo.array;

public class LongestPalindrome {


    private static void findMaxLength(String t) {

        if (t == null || t.isEmpty()) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("^#");
        for (int i = 0; i< t.length(); i++) {
            sb.append(t.charAt(i)).append("#");
        }
        sb.append("$");

        String value = sb.toString();
        int n = value.length();
        int C = 0;
        int R = 0;
        int maxLength = Integer.MIN_VALUE;
        int centerIndex = -1;

        int[] P = new int[n];

        for (int i =1; i<n-1; i++) {
            if (R > i) {
                P[i] = Math.min(R-i, 2*C -i);
            }

            while (value.charAt( i+1+P[i]) == value.charAt(i-1-P[i])) {
                P[i] ++;
            }

            if (i +P[i] > R) {
                R = i + P[i];
                C = i;
            }

            if (P[i] > maxLength) {
                maxLength = P[i];
                centerIndex = i;
            }
        }

        int start = (maxLength - centerIndex) /2;

        System.out.println(t.substring(start, start+maxLength));

    }

    public static void main(String[] args) {
        findMaxLength("abba");
    }
}
