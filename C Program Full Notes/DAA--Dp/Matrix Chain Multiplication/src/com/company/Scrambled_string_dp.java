package com.company;

import java.util.HashMap;

//Scrambled String Bottom up DP
public class Scrambled_string_dp {
    public static HashMap<String , Boolean> mp = new HashMap<>(100);
    public static void main(String[] args) {
        String a = "great";
        String b = "grea";

        boolean ans;
        if (a.length() != b.length()){
            ans = false;
        }else{
            ans = true;
        }
        if(ans == false){
            System.out.println("a and b are not scramble string");
            return;
        }
        ans = isScrambled(a,b);
        if(ans == false){
            System.out.println("a and b are not scramble string");
        }else {
            System.out.println("a and b are scramble string");
        }
    }

    public static boolean isScrambled(String a, String b){
        if (a.compareTo(b) == 0){
            return true;
        }
        if (a.length() <= 1){
            return false;
        }

        String key = a+" "+b;
        if (mp.containsKey(key)){
            return mp.get(key);
        }

        int n = a.length();
        boolean flag = false;
        for (int i=1;i<n;i++){
            if (((isScrambled(a.substring(0,i),b.substring(n-i,n)) == true) && (isScrambled(a.substring(n-i,n),b.substring(0,i)) == true)) || ((isScrambled(a.substring(0,i),b.substring(0,i)) == true) && (isScrambled(a.substring(i,n),b.substring(i,n)) == true))){
                flag = true;
                break;
            }
        }
        mp.put(key,flag);
        return flag;
    }

}
