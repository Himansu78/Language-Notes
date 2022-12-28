package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Min_SubsetSum_Diff {
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
        System.out.println("The Minimum Subset Sum Difference is: "+ minSubsetSumDiff(arr,sum,n));
    }

    public static int minSubsetSumDiff(ArrayList<Integer> arr, int range, int n){
        boolean[][] t = new boolean[n+1][range+1];

        //Initialization
        for (int i = 0; i <= n; i++)
            t[i][0] = true;
        for (int i = 1; i <= range; i++)
            t[0][i] = false;


        for (int i=1;i<n+1;i++){
            for (int j=1;j<range+1;j++){
                if (arr.get(i-1) <= j){
                    t[i][j] = t[i-1][j-arr.get(i-1)] || t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        int diff = Integer.MAX_VALUE;

        for (int j = range / 2; j >= 0; j--) {
            // Find the
            if (t[n][j] == true) {
                diff = range - 2 * j;
                break;
            }
        }
        return diff;
    }
}
