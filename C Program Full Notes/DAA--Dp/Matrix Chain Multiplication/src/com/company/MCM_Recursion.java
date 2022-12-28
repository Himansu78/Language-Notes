package com.company;

import java.util.Scanner;

//Recursive code of Matrix Chain Multiplication
public class MCM_Recursion {
    public static void main(String[] args) {
        int[] arr = {2,3,3,5};
        System.out.println("Minimum cost of the MCM: " + mcm_recursive(arr,1,arr.length-1));
    }
    public static int mcm_recursive(int[] arr,int i,int j){
        //Base Condition
        if (i>=j) {
            return 0;
        }

        int mn = Integer.MAX_VALUE;
        for (int k=i;k<j;k++){
            int tempAns = mcm_recursive(arr,i,k) + mcm_recursive(arr,k+1,j) + arr[i-1]*arr[k]*arr[j];

            if (mn > tempAns){
                mn = tempAns;
            }
        }
        return mn;
    }
}
