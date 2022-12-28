package com.company;

import java.util.Scanner;

public class Delete_Duplicate_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        for (String c:arr){
            System.out.println(c);
        }
    }
}
