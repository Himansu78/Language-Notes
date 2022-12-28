package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Top_Down_Unbounded {
    //Unbounded Knapsack Top-down code
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

        System.out.println("Maximum Profit: "+ unbKnapsack(weight,value,W,n));
    }

    public static int unbKnapsack(ArrayList<Integer> weight, ArrayList<Integer> value, int W, int n){
        int t[][] = new int[n+1][W+1];

        //Initialization
        for (int i=0;i<n+1;i++){
            t[i][0] = 0;
        }
        for (int i=0;i<W+1;i++){
            t[0][i] = 0;
        }

        for(int i=1;i<n+1;i++){
            for (int j=1;j<W+1;j++){
                if (weight.get(i-1) <= j){
                    t[i][j] = Math.max(value.get(i-1) + t[i][j-weight.get(i-1)], t[i-1][j]);
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][W];
    }

}
