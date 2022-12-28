package com.company;

public class Sudoko_Game_Solver {
    public static void main(String[] args) {
        int grid[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                         { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                         { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                         { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                         { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                         { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                         { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                         { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                         { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        if (sudokuSolver(grid,0,0))
            for (int i=0;i<9;i++){
                for (int j=0;j<9;j++){
                    System.out.print(grid[i][j] + "  ");
                }
                System.out.println();
            }
        else
            System.out.println("No Solution exists");
    }

    public static boolean sudokuSolver(int[][] grid, int row, int col){
        int n = grid.length;
        if (row==n-1 && col==n)
            return true;

        if (col == n){
            col = 0;
            row++;
        }

        if (grid[row][col]!=0){
            return sudokuSolver(grid,row, col+1);
        }

        for (int k=1;k<10;k++){
            if (isSafe(grid,row,col,k)){
                grid[row][col] = k;

                if (sudokuSolver(grid,row,col+1))
                    return true;
            }
            grid[row][col] = 0;
        }

    return false;

    }

    public static boolean isSafe(int[][] grid, int row, int col, int num){
        for (int i=0;i<grid.length;i++)
            if (grid[row][i] == num)
                return false;

        for (int i=0;i<grid.length;i++)
            if (grid[i][col] == num)
                return false;

        int startRow = row - row%3;
        int startCol = col - col%3;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (grid[i + startRow][j + startCol] == num)
                    return false;

        return true;
    }
}


