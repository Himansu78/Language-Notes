package com.company;
    // Egg dropping Problem Recursive
public class Egg_Dropping {
    public static void main(String[] args) {
        int e = 8;
        int f = 4;
        System.out.println("Minimum no. of attempts : "+ eggDropping(e,f));
    }

    public static int eggDropping(int e,int f){
        if(f==0 || f==1){
            return 0;
        }
        if (e==1){
            return f;
        }

        int min = Integer.MAX_VALUE;
        for(int k=1;k<=f;k++){
            int tempans = 1+Math.max(eggDropping(e-1,k-1),eggDropping(e,f-k));

            min = Math.min(tempans, tempans);
        }
        return min;
    }
}
