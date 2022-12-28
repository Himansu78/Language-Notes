package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSetSum_Problem {
    //Variation 01-Knapsack
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elemets: ");
        int n = sc.nextInt();
        System.out.println("Enter the array: ");
        ArrayList<Integer> arr = new ArrayList<>(n);

        for (int i=0;i<n;i++){
            int w = sc.nextInt();
            arr.add(w);
        }
        System.out.print("Enter the Sum: ");
        int sum = sc.nextInt();
        boolean flag = Subset(arr,sum,n);
        if(flag == true)
            System.out.println("The Array is a Subset of the Sum");
        else
            System.out.println("The array is not the Subseut Sum");
    }

    public static boolean Subset(ArrayList<Integer> arr, int sum, int n){
        boolean[][] t = new boolean[n+1][sum+1];
        for (int i=0;i<n+1;i++){
            for (int j=0;j<sum+1;j++){
                if (j==0){
                    t[i][j] = true;
                }
                if(i==0 && j!=0){
                    t[i][j] = false;
                }
            }
        }

        for (int i=1;i<n+1;i++){
            for (int j=1;j<sum+1;j++){
                if (arr.get(i-1) <= j){
                    t[i][j] = t[i-1][j-arr.get(i-1)] || t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][sum];
    }
}
