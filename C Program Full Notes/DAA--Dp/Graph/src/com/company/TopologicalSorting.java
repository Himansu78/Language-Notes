package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class TopologicalSorting {
    //Topological sorting on Directed acyclic graphs
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u ,int v){
        adj.get(u).add(v);
    }
    public static void main(String[] args) {
        int v = 9;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj,0, 3);
        addEdge(adj,0, 4);
        addEdge(adj,1, 3);
        addEdge(adj,1, 7);
        addEdge(adj,2, 0);
        addEdge(adj,2, 1);
        addEdge(adj,3, 6);
        addEdge(adj,4, 5);
        addEdge(adj,4, 3);
        addEdge(adj,5, 6);
        addEdge(adj,6, 8);
        addEdge(adj,7, 6);

    int[] order = topSort(adj,v);
        System.out.print("The topological order of the graph is: ");
        for (int n: order){
            System.out.print(n+ "  ");
        }


    }

    static int[] topSort(ArrayList<ArrayList<Integer>> graph, int V){
        boolean[] visited = new boolean[V];
        int[] order = new int[V];

        Arrays.fill(visited,false);
        int n = V-1;

        for (int i=0;i<V;i++){
            if (visited[i] == false){
                ArrayList<Integer> visitedNode = new ArrayList<Integer>();
                dfs(i, visited, visitedNode, graph);
                for (int node:visitedNode) {
                    order[n] = node;
                    n--;
                }
            }
        }

        return order;
    }

    static void dfs(int node, boolean[] visited, ArrayList<Integer> visitedNode, ArrayList<ArrayList<Integer>> graph){
        visited[node] = true;

        for (int at:graph.get(node)){
            if (visited[at] == false){
                dfs(at, visited, visitedNode, graph);
            }
        }
        visitedNode.add(node);
    }

}
