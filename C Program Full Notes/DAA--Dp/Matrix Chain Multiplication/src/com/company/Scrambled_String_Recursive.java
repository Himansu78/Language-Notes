package com.company;
    //Scarambled String Recursive approach
public class Scrambled_String_Recursive {
    public static void main(String[] args) {
        String a = "great";
            String b = "rgeat";

            boolean ans;
            if (a.length() != b.length()){
                ans = false;
            }else{
                ans = true;
            }
            if(ans == false){
                System.out.println("a and b are not scramble string");
            }
            ans = solve(a,b);
            if(ans == false){
                System.out.println("a and b are not scramble string");
            }else {
            System.out.println("a and b are scramble string");
        }
    }

    public static boolean solve(String a, String b){
        if (a.compareTo(b) == 0){
            return true;
        }
        if (a.length() <= 1){
            return false;
        }

        int n = a.length();
        boolean flag = false;
        for (int i=1;i<n;i++){
            if (((solve(a.substring(0,i),b.substring(n-i,n)) == true) && (solve(a.substring(n-i,n),b.substring(0,i)) == true)) || ((solve(a.substring(0,i),b.substring(0,i)) == true) && (solve(a.substring(i,n),b.substring(i,n)) == true))){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
