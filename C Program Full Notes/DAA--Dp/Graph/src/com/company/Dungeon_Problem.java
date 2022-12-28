package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Dungeon_Problem {
    public static int R = 5;
    public static int C = 7;
    public static LinkedList<Integer> rq = new LinkedList<Integer>();
    public static LinkedList<Integer> cq = new LinkedList<Integer>();
    public static int moveCount = 0;
    public static int node_left_in_layer = 1;
    public static int node_in_next_layer = 0;
    public static boolean[][] visited = new boolean[R][C];
    public static void main(String[] args) {
        char[][] matrix = {{'S',' ',' ','N',' ',' ',' '},
                           {' ','N',' ',' ',' ','N',' '},
                           {' ','N',' ',' ',' ',' ',' '},
                           {' ',' ','N','N',' ',' ',' '},
                           {'N',' ','N','E',' ','N',' '}};
        int sr = 0;
        int sc = 0;
        System.out.println("The number of moves: "+dungeonProblem(matrix, sc, sr));

     }
     public static int dungeonProblem(char[][] matrix, int sc, int sr){

        for (boolean[] v:visited){
            Arrays.fill(v,false);
        }
        boolean reached_end = false;


        rq.add(sr);
        cq.add(sc);
        visited[sr][sc] = true;
        while(rq.size()>0 && cq.size()>0){
            int r = rq.poll();
            int c = cq.poll();
            if (matrix[r][c] == 'E'){
                reached_end = true;
                break;
            }
            explore_neighbours(matrix,r,c);
            node_left_in_layer--;
            if (node_left_in_layer == 0){
                node_left_in_layer = node_in_next_layer;
                node_in_next_layer = 0;
                moveCount++;
            }

        }
         if (reached_end){
             return moveCount;
         }
         return -1;
     }

     public static void explore_neighbours(char[][] matrix, int r, int c){
         int[] dr = {-1, +1, 0, 0};
         int[] dc = {0, 0, +1, -1};

         for (int i=0;i<4;i++){
                int rr = r + dr[i];
                int cc = c + dc[i];

                if (rr<0 || cc<0 )
                    continue;
                if (rr>=R || cc>=C)
                    continue;

                if (visited[rr][cc])
                    continue;
                if (matrix[rr][cc]=='N')
                    continue;

                rq.add(rr);
                cq.add(cc);
                visited[rr][cc] = true;
                node_in_next_layer++;
            }
     }
}
