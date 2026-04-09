package com.algo.array;

import java.util.Arrays;

public class NQueen {

    private static int val = 1;

    private static boolean isSafe(char[][] board,int row, int colum) {
        //Checking Column

        for (int i = 0; i<row; i++) {
            if (board[i][colum] =='Q' ) {
                return false;
            }
        }

        //Checking '\' conflict

        for (int i=row, j = colum; i>=0 && j>=0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        //Checking '/' conflict

        for (int i = row, j=colum; i >=0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private static void nQueen(char[][] board, int r) {
        if (r == board.length) {
            printBoard(board);
            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, r, col)) {

                board[r][col] ='Q';

                nQueen(board, r +1);
                board[r][col] = '-';
            }
        }
    }

    private static void printBoard(char[][] board) {
        for (char[] chars: board) {
            System.out.println(Arrays.toString(chars).replaceAll(",", ""));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int N = 4;
        char[][] board = new char[N][N];

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                board[i] [j] = '-';
            }
        }

        nQueen(board, 0);
    }
}
