package com.company;

import java.util.ArrayList;
import java.util.Scanner;

//Unbounded Knapsack Variation - Rod Cutting Problem
//It is fully similar to unbounded Knapsack only the question is asked in different manner
// Code is simillar to unbounded Knapsack

public class Rod_Cutting_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of possible small lengths of rod : ");
        int n = sc.nextInt();
        System.out.println("Enter the details below: ");
        ArrayList<Integer> length = new ArrayList<>(n);
        ArrayList<Integer> price = new ArrayList<>(n);

        for (int i=0;i<n;i++){
            System.out.print("Small Rod-" +(i+1)+ " : Length- ");
            int w = sc.nextInt();
            length.add(w);
            System.out.print( "          : Price- ");
            price.add(sc.nextInt());
        }
        System.out.print("Enter the length of the rod: ");
        int L = sc.nextInt();

        System.out.println("Maximum Profit: "+ unbKnapsack(length,price,L,n));
    }

    public static int unbKnapsack(ArrayList<Integer> length, ArrayList<Integer> price, int L, int n){
        int t[][] = new int[n+1][L+1];

        //Initialization
        for (int i=0;i<n+1;i++){
            t[i][0] = 0;
        }
        for (int i=0;i<L+1;i++){
            t[0][i] = 0;
        }

        for(int i=1;i<n+1;i++){
            for (int j=1;j<L+1;j++){
                if (length.get(i-1) <= j){
                    t[i][j] = Math.max(price.get(i-1) + t[i][j-length.get(i-1)], t[i-1][j]);
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][L];
    }
}
