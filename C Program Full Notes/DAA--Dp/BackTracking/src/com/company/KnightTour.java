package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class KnightTour {
    public static int[] rows = {-2,-1,1,2,2,1,-1,-2};
    public static int[] cols = {1,2,2,1,-1,-2,-2,-1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of board: ");
        int n = sc.nextInt();
        int[][] chess = new int[n][n];

        for (int[] arr:chess){
            Arrays.fill(arr,-1);
        }
        chess[0][0] = 0;
        KnightTour(chess,0,0,1);
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    System.out.print(chess[i][j] + " ");
                }
                System.out.println();
            }
    }

    public static boolean KnightTour(int[][] chess, int row, int col, int move){
        if (move == chess.length*chess.length){
            return true;
        }

        for (int i=0;i< chess.length;i++){
            int r = row + rows[i];
            int c = col + cols[i];
            if (isSafe(chess,r,c)){
                chess[r][c] = move;

                if(KnightTour(chess,r,c,move+1)){
                    return true;
                }
                else
                    chess[r][c] = -1;
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] chess, int r, int c){
        return r >= 0 && c >= 0 && r <= chess.length - 1 && c <= chess.length - 1 && chess[r][c] == -1;
    }

}
