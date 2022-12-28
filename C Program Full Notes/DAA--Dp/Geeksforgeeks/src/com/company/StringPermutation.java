package com.company;

import java.util.ArrayList;

public class StringPermutation {
        public static ArrayList<String> ans = new ArrayList<String>();
    public static void main(String[] args) {
        String str = "ABC";
        String res="";
        System.out.println("The possible combinations are: ");
        premutation(str,res,str.length());
        System.out.println(ans);
    }


    public static void premutation(String str, String res, int n){
        //Base case
        if (res.length() == n){
            ans.add(res);
            return;
        }
        for (int i=0;i<str.length();i++){
            String rs = res + str.charAt(i);
            String temp = str.substring(0,i) + str.substring(i+1);
            premutation(temp,rs,n);
        }
    }


}
