package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstra_Algorithm {
    public static void addEdge(ArrayList<ArrayList<Graph2>> adj, int u , Graph2 v){
        adj.get(u).add(v);
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Graph2>> g = new ArrayList<ArrayList<Graph2>>();
        for (int i=0;i<v;i++){
            g.add(new ArrayList<Graph2>());
        }
        addEdge(g,0,new Graph2(1,4));
        addEdge(g,0,new Graph2(2,1));
        addEdge(g,1,new Graph2(3,1));
        addEdge(g,2,new Graph2(1,2));
        addEdge(g,2,new Graph2(3,5));
        addEdge(g,3,new Graph2(4,3));

        int[] distance = dijkstra(g,v,0);

        for (int x: distance) {
            System.out.print(x + " ");
        }

    }

    public static int[] dijkstra(ArrayList<ArrayList<Graph2>> g,int v,int start){
        boolean[] visited = new boolean[v];
        int dist[] = new int[v];
        Arrays.fill(visited,false);
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start] = 0;
        PriorityQueue<PQObject> pq = new PriorityQueue<PQObject>();
        pq.add(new PQObject(start,0));
        while(pq.size()!=0){
            PQObject obj = pq.poll();
            int index = obj.node;
            int minValue = obj.dist;
            visited[index] = true;
            if (dist[index] < minValue) continue;
            for (Graph2 at:g.get(index)){
                if (visited[at.v] == true)continue;
                int newDist = dist[index] + at.w;
                if(newDist < dist[index]){
                    dist[index] = newDist;
                    pq.add(new PQObject(at.v, at.w));
                }
            }
        }
        return dist;
    }

}

class Graph2{
    int v,w;
    public Graph2(int v, int w){
        this.v = v;
        this.w = w;
    }
}

class PQObject{
    int node, dist;
    public PQObject(int node, int dist){
        this.dist = dist;
        this.node = node;
    }
}