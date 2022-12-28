package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class ConnectedComponents2 {
    //Connected components by Adjacency list
    public static int n = 7;
    public static boolean[] visited = new boolean[n];
    public static int count = 0;
    public static int[] componenet = new int[n];
    public static void main(String[] args) {
        int v = 7;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(v);
        for (int i=0;i<v;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);graph.get(0).add(2);
        graph.get(1).add(0);graph.get(1).add(2);
        graph.get(2).add(0);graph.get(2).add(1);
        graph.get(3).add(4);graph.get(3).add(5);
        graph.get(4).add(3);
        graph.get(4).add(3);

        Arrays.fill(visited, false);

        for (int i=0;i<v;i++){
            if (!visited[i]){
                count++;
                dfs(graph,i);
            }
        }

        for(int c:componenet){
            System.out.println(c+" ");
        }
        System.out.println("The disjoint graph are"+ count);
    }

    static void dfs(ArrayList<ArrayList<Integer>> graph, int start){
        if (visited[start])
            return;

        visited[start] = true;
        componenet[start] = count;
        for (int a:graph.get(start)){
            if (!visited[a])
                dfs(graph, a);
        }
        
    }
}
