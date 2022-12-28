package com.company;

import java.util.ArrayList;
import java.util.Scanner;

        // 0-1 Knapsack Recursive code

public class Recursive_code {
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
        System.out.println("The max. profit we can get by selling these products is: "+ Knapsack(weight,value,W,n));
    }

    public static int Knapsack(ArrayList<Integer> weight, ArrayList<Integer> value, int W, int n){
        if(W==0 || n==0){
            return 0;
        }
        if (weight.get(n-1) <= W){
            return Math.max(value.get(n-1)+Knapsack(weight,value,(W-weight.get(n-1)) ,n-1), Knapsack(weight, value, W, n-1));
        }
        else{
            return Knapsack(weight,value,W,n-1);
        }
    }

}
