package com.company;

import java.util.Arrays;

public class Egg_Dropping_Optimization {
    public static int[][] temp = new int[100][100];
    public static void main(String[] args) {
        int e = 3;
        int f = 7;

        for (int[] s: temp){
            Arrays.fill(s,-1);
        }

        System.out.println("Minimum no. of attempts : "+ eggDropping(e,f));
    }
    public static int eggDropping(int e,int f){
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
            int lower,upper;

            if(temp[e-1][k-1] != -1){
                lower = temp[e-1][k-1];
            }else{
                lower = eggDropping(e-1,k-1);
                temp[e-1][k-1] = lower;
            }

            if(temp[e][f-k] != -1){
                upper = temp[e][f-k];
            }else{
                upper = temp[e][f-k];
                temp[e][f-k] = upper;
            }

            int tempans = 1+Math.max(lower,upper);

            min = Math.min(tempans, tempans);
        }
        return temp[e][f] = min;
    }

}
