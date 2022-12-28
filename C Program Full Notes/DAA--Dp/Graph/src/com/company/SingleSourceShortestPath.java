package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class SingleSourceShortestPath {
    //find the shortest distance from a source to all the nodes.
    public static void main(String[] args) {
        int V = 8;      //No. of vertices
        Graph graph = new Graph();
        Graph.GraphClass g = graph.newGraph(V);
        g.addEdge(0,1,3);
        g.addEdge(0,2,3);
        g.addEdge(1,2,4);
        g.addEdge(1,3,4);
        g.addEdge(1,4,11);
        g.addEdge(2,3,8);
        g.addEdge(2,6,11);
        g.addEdge(3,4,-4);
        g.addEdge(3,5,5);
        g.addEdge(3,6,2);
        g.addEdge(4,7,9);
        g.addEdge(5,7,1);
        g.addEdge(6,7,2);

        int[] shortestPath = new int[V];
        int start = 0;

        shortestPath = shortestPath(g,start,V);

    }

    public static int[] shortestPath(Graph.GraphClass g, int start, int v){
        int[] topsort = topSort(g,v);
        for (int i=0;i<v;i++)
            System.out.print(" "+ topsort[i]);
        return new int[]{10,20};
    }

    static int[] topSort(Graph.GraphClass graph, int V){
        boolean[] visited = new boolean[V];
        int[] order = new int[V];

        Arrays.fill(visited,false);
        int n = V-1;

        for (int i=0;i<V;i++){
            if (visited[i] == false){
                n = dfs(i,n,visited, order, graph);
            }
        }

        return order;
    }

    static int dfs(int node,int n, boolean[] visited, int[] order, Graph.GraphClass graph){
        visited[node] = true;

       Iterator<Graph.AdjacentListNode> it = graph.adj[node].iterator();
       while(it.hasNext()){
           Graph.AdjacentListNode ad = it.next();
           if (visited[ad.v] == false)
               n = dfs(ad.v,n,visited,order,graph);
       }
//        for (int at:graph.adj[node][node].){
//            if (visited[at] == false){
//                n = dfs(at,n, visited, order, graph);
//            }
//        }
        order[n] = node;
        return n-1;
    }
}

class Graph{
    class AdjacentListNode{
        int v,weight;
        public AdjacentListNode(int v, int weight){
            this.v = v;
            this.weight = weight;
        }
        private int get(){
            return v;
        }

        private int getWeight(){
            return weight;
        }
    }

    class GraphClass{
        int v;
        LinkedList<AdjacentListNode> adj[];
        public GraphClass(int v){
            this.v = v;
            for (int i=0;i<v;i++){
                adj[i] = new LinkedList<AdjacentListNode>();
            }
        }

        void addEdge(int u, int v, int weight){
            AdjacentListNode edge = new AdjacentListNode(v,weight);
            adj[u].add(edge);
        }

    }

    GraphClass newGraph(int v){
        return  new GraphClass(v);
    }
}