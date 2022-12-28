package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CountSubsetSum_Diff {
    //01-Knapsack Variation - Count the number of Subset with the given difference
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the array: ");
        ArrayList<Integer> arr = new ArrayList<>(n);
        int sum = 0;
        for (int i=0;i<n;i++){
            int w = sc.nextInt();
            sum += w;
            arr.add(w);
        }
        System.out.print("Enter the difference: ");
        int diff = sc.nextInt();
        int s = (sum+diff) / 2;
        System.out.println("The number of Subset Sum with Difference "+ diff + " is: "+ Count_Subset_Sum.Count_Subset(arr,s,n));
    }
}
