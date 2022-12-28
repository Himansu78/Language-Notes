package com.company;

import java.util.Arrays;

public class ConnctedComponentsDFS {
    public static int n = 7;
    public static boolean[] visited = new boolean[n];
    public static int count = 0;
    public static int[] componenet = new int[n];
    public static void main(String[] args) {
        int[][] matix = {{0,1,1,0,0,0,0},
                         {1,0,1,0,0,0,0},
                         {1,1,0,0,0,0,0},
                         {0,0,0,0,1,1,0},
                         {0,0,0,1,0,0,0},
                         {0,0,0,1,0,0,0},
                         {0,0,0,0,0,0,0}};

        Arrays.fill(visited,false);

        for (int i=0;i<n;i++){

            if (visited[i] == false){
                ++count;
                dfs(matix, i);
            }
        }

        for (int comp:componenet){
            System.out.print(comp + " ");
        }
        System.out.println("\nThe number of disjoint graphs are: "+ count);
    }


    public static void dfs(int[][] matrix, int start){
        if (visited[start]){
            return;
        }

        visited[start] = true;
        componenet[start] = count;

        for (int j=start;j<n;j++){
            if (matrix[start][j]==1 && visited[j]==false)
                dfs(matrix,j);
        }

    }
}