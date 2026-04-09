package com.algo.array;

import java.util.Arrays;

public class KnightTour {

    private static final int SIZE = 5;
    private static final int[] X = {2, 1, -1,-2,-2, -1, 1, 2, 2};
    private static final int[] Y = {1, 2, 2, 1, -1, -2, -2,-1, 1};

    private static boolean isValid(int row, int col) {
        if (row <0 || col <0 || row >= SIZE || col >= SIZE) {
            return false;
        }

        return true;
    }

    private static void knightTour(int[][] visited, int x, int y, int position) {
        if (position == SIZE * SIZE) {
            printTour(visited);
            return;
        }

        visited[x][y] = position;

        for (int i = 0; i<X.length; i++) {

            int newX = x + X[i];
            int newY = y + Y[i];

            if (isValid(newX, newY) && visited[newX][newY] == 0) {
                knightTour(visited, newX, newY, position+1);
            }
        }

        visited[x][y] = 0;
    }

    private static void printTour(int[][] visited) {
        for (int[] t : visited) {
            System.out.println(Arrays.toString(t));
        }
        System.out.println();
    }


    public static void main(String[] args) {
        knightTour(new int[SIZE][SIZE],0, 0 , 1);
    }
}
