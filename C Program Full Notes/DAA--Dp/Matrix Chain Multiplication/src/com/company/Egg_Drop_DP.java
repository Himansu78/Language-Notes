package com.company;

import java.util.Arrays;

//Egg Dropping Problem Bottom up DP
public class Egg_Drop_DP {
    public static int[][] temp = new int[100][100];
    public static void main(String[] args) {
        int e = 1;
        int f = 4;
        for (int[] ar: temp){
            Arrays.fill(ar,-1);
        }

        System.out.println("Minimum no. of attempts : "+ eggDropping(e,f));

    }

    public static int eggDropping(int e, int f){
        if(f==0 || f==1){
            return 0;
        }
        if (e==1){
            return f;
        }

        if(temp[e][f] != -1){
            return temp[e][f];
        }

        int min = Integer.MAX_VALUE;
        for(int k=1;k<=f;k++){
            int tempans = 1+Math.max(eggDropping(e-1,k-1),eggDropping(e,f-k));

            min = Math.min(tempans, tempans);
        }
        return temp[e][f] = min;
    }
}
