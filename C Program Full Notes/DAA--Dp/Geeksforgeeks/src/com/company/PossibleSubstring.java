package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PossibleSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("The number of sub-string: "+ substring(str));
    }
    public static ArrayList<String> substring(String str){
        ArrayList<String> arr = new ArrayList<String>();
        for (int i=1;i<=str.length();i++){
            for (int j=0;j<str.length();j++){
                arr.add(str.substring(j,j+i));
                if(i+j >= str.length()){
                    break;
                }
            }
        }
        return arr;
    }
}
