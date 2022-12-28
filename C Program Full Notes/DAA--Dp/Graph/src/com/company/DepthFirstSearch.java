package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class DepthFirstSearch {
    public static int n = 5;
    public static boolean visited[] = new boolean[n];
    public static void main(String[] args) {

        int[][] M = {{0,0,0,0,0},
                     {0,0,1,1,1},
                     {0,1,0,1,1},
                     {0,1,1,0,1},
                     {0,1,1,1,0} };

        Arrays.fill(visited,false);
        DFS(M,3  );

    }

    public static void DFS(int[][] M, int start){
        if (visited[start]){
            return;
        }
        visited[start] = true;
        System.out.print(start + " ");

        for (int i=1;i<n;i++){
            for (int j=1;j<n;j++) {
                if (M[i][j] == 1 && visited[i] == false) {
                    DFS(M, i);
                }
            }
        }

    }
}