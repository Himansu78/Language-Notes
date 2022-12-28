package com.company;

//Unbounded Knapsack Problem - Coin change
//Find out hte maximum number of ways to get the number from the coin given in array

import java.util.ArrayList;
import java.util.Scanner;

public class Coin_change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of coins: ");
        int n = sc.nextInt();
        System.out.println("Enter the coin array: ");
        ArrayList<Integer> arr = new ArrayList<>(n);

        for (int i=0;i<n;i++){
            int w = sc.nextInt();
            arr.add(w);
        }
        System.out.print("Enter the Number: ");
        int sum = sc.nextInt();
        System.out.println("The max number of ways to get sum: "+ coinChange(arr,sum,n));
    }

    public static int coinChange(ArrayList<Integer> arr,int Sum, int n){
        int[][] t = new int[n+1][Sum+1];
        //Initialization
        for (int i=0;i<n+1;i++){
            t[i][0] = 1;
        }
        for (int i=0;i<Sum+1;i++){
            t[0][Sum] = 0;
        }


        for (int i=1;i<n+1;i++){
            for (int j=1;j<Sum+1;j++){
                if (arr.get(i-1) <= j){
                    t[i][j] = t[i][j-arr.get(i-1)] + t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][Sum];
    }
}
