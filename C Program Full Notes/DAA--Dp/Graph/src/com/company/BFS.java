package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class BFS {
    public static void main(String[] args) {
        int[][] g = {{0,1,1,0,0,0,0,0,0,0,0},
                     {1,0,0,0,0,0,1,0,0,0,0},
                     {1,0,0,1,1,0,0,0,0,0,0},
                     {0,0,1,0,0,1,1,1,0,0,0},
                     {0,0,1,0,0,0,0,0,1,0,0},
                     {0,0,0,1,0,0,0,0,1,0,0},
                     {0,1,0,1,0,0,0,0,0,0,0},
                     {0,0,0,1,0,0,0,0,0,0,1},
                     {0,0,0,0,0,1,1,0,0,1,0},
                     {0,0,0,0,0,0,0,0,1,0,0},
                     {0,0,0,0,0,0,0,1,0,0,0}};

        ArrayList<Integer> arr = bfs(g,0);

        ArrayList<Integer> path = reconstructPath(0,arr.get(arr.size()-1),arr);

        for (int p:path){
            System.out.println(p+" --> ");
        }

    }
    public static ArrayList<Integer> bfs(int[][] g,int start){
        //Queue Data structure
        LinkedList<Integer> queue = new LinkedList<Integer>();

        boolean[] visited = new boolean[g.length];
        ArrayList<Integer> ans = new ArrayList<Integer>(g.length);
        Arrays.fill(visited,false);

        queue.add(start);
        visited[start] = true;
        System.out.print("The BFS traversal: " +start + " ");
        ans.add(start);

        while(queue.size()>0){
            int node = queue.poll();
            for (int i=0;i<g.length;i++){
                if(g[node][i]==1 && visited[i]==false){
                    queue.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                    ans.add(i);
                }
            }
        }
        return ans;
    }

    public static ArrayList<Integer> reconstructPath(int start, int end, ArrayList<Integer> arr){
        ArrayList<Integer> path = new ArrayList<Integer>();
        for (int i = end;i!=0;i = arr.get(i)){
            path.add(i);
            arr.remove(i);
        }


        Collections.reverse(path);

        if (path.get(0) == start)
            return path;
        path.clear();
        return path;
    }

}
