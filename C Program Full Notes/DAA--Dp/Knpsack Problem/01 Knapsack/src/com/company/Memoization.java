package com.company;

    //01-Knapsack Memoization

import java.util.ArrayList;
import java.util.Scanner;


public class Memoization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        System.out.println("Enter the product details below: ");
        ArrayList<Integer> weight = new ArrayList<>(n);
        ArrayList<Integer> value = new ArrayList<>(n);

        for (int i=0;i<n;i++){
            System.out.print("Product-" +(i+1)+ " : Wt- ");
            int w = sc.nextInt();
            weight.add(w);
            System.out.print( "          : Val- ");
            value.add(sc.nextInt());
        }
        System.out.print("Enter the Max. capacity of container: ");
        int W = sc.nextInt();
        int t[][] = new int[n+1][W+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                t[i][j] = -1;
            }
        }


        System.out.println("Maximum Profit: "+Knapsack(t,weight,value,W,n));

    }

    public static int Knapsack(int[][] t, ArrayList<Integer> weight, ArrayList<Integer> value, int W, int n){
       if(n==0 || W==0){
           return 0;
       }
       if(t[n][W] != -1){
           return t[n][W];
       }
       if(weight.get(n-1) <= W){
           return t[n][W] = Math.max(value.get(n-1)+Knapsack(t, weight,value,W-weight.get(n-1),n-1), Knapsack(t, weight,value,W,n-1));
       }else{
           return t[n][W] = Knapsack(t, weight,value,W,n-1);
       }
    }
}
