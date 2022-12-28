package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Equal_sum_Partition {
    // Variation of 01-Knapsack Equal sum Partition
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

        boolean flag = equalSum(arr,sum,n);
        if(flag == true)
            System.out.println("The Array can be equally Partitioned");
        else
            System.out.println("The Array can not be equally Partitioned");

    }

    public static boolean equalSum(ArrayList<Integer> arr, int sum, int n){
        if (sum%2 != 0){
            return false;
        }else
            return SubSetSum_Problem.Subset(arr,sum/2,n);
    }
}
