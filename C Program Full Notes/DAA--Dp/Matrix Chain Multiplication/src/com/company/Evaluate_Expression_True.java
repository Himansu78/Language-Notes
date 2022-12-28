package com.company;

import java.util.ListResourceBundle;

//Evaluate an expression to true : Recursive code
    //Return the number of possible ways to evaluate an expression to true by giving parenthesis
public class Evaluate_Expression_True {
    public static void main(String[] args) {
        String s = "T|F&T^F";

        System.out.println("The number of ways to evaluate the expression to true is: "+solve(s,0,s.length()-1,true));

    }

    public static int solve(String s, int i, int j, boolean isTrue){
        if (i>j){
            return 0;
        }
        if(i == j){
            if(isTrue==true){
                return (s.charAt(i)=='T')?1:0;
            }else{
                return (s.charAt(i))=='F'?1:0;
            }
        }
        int ans = 0;
        for(int k=i+1;k<j;k++){
            int LT = solve(s,i,k-1,true);
            int LF = solve(s,i,k-1,false);
            int RT = solve(s,k+1,j,true);
            int RF = solve(s,k+1,j,false);

            //for &-operator
            if (s.charAt(k) == '&'){
                if (isTrue==true){
                    ans = ans + LT*RT;
                }else{
                    ans = ans + LF*RF + LT*RF + LF*RT;
                }
            }
            //for |-operator
            else if(s.charAt(k)=='|'){
                if (isTrue==true){
                    ans = ans + LT*RT + LF*RT + LT*RF;
                }else{
                    ans = ans + LF+RF;
                }
            }
            //for ^-operator
            else if (s.charAt(k)=='^'){
                if (isTrue==true){
                    ans = ans + LF*RT + LT*RF;
                }else{
                    ans = ans + LT*RT + LF*RF;
                }
            }

        }
        return ans;
    }
}
