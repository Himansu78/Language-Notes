package com.company;

import java.util.Arrays;

//MCM Bottom-up/Memoize code
public class MCM_Memoize_DP {
    public static int[][] t = new int[101][101]; //To be decided according the constraints in the question
    public static void main(String[] args) {
        int[] arr = {2,3,3,5};
        for (int[] ar: t){
            Arrays.fill(ar,-1);
        }
        System.out.println("Minimum cost of the MCM: " + mcm(arr,1,arr.length-1));

    }

    public static int mcm(int[] arr,int i,int j){ // i=1, j=arr.length-1
        //Base Condition
        if (i>=j){
            return 0;
        }

        //Checking in the matrix t
        if (t[i][j] != -1){
            return t[i][j];
        }
        int min = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int tempAns = mcm(arr,i,k) + mcm(arr,k+1,j) + arr[i-1]*arr[k]*arr[j];

            if (min > tempAns){
                min = tempAns;
            }
        }
        return t[i][j] = min;
    }
}
