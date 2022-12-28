package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class All_Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Character> ch = new ArrayList<>(s.length());
        for(int i=0;i<s.length();i++){
            if(ch.contains(s.charAt(i)) == false){
                ch.add(s.charAt(i));
                int count = 0;
                for (int j=0;j<s.length();j++){
                    if(s.charAt(i) == s.charAt(j)){
                        count++;
                    }
                }
                System.out.println(s.charAt(i) + " Occured: "+ count+" times");
            }

        }
    }
}
