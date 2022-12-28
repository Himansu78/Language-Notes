package com.company;

import java.util.Arrays;

// Check the result string  are successful shuffle of the string
public class Suffle_String {
    public static void main(String[] args) {
        String first = "xy";
        String second = "12";
        String[] result = {"x1y2", "1yx2" , "xxy221"};

        for (String s:result){
            if(checkLength(first,second,s) == true && shuffleCheck(first,second,s) == true){
                System.out.println(s+" is a successful shuffle of "+ first +" and " +second);
            }else{
                System.out.println(s+" is not a successful shuffle of "+ first +" and " +second);
            }
        }
    }

    public static boolean checkLength(String f, String s, String r){
        if(f.length()+s.length() == r.length()){
            return true;
        }else{
            return false;
        }
    }

    public static boolean shuffleCheck(String f, String s, String r){
        f = sortString(f);
        s = sortString(s);
        r = sortString(r);
        int i,j,k;
        i=j=k=0;
        while(k < r.length()){
            if (i<f.length() && f.charAt(i)==r.charAt(k)){
                i++;k++;
            }else if(j<s.length() && s.charAt(j)==r.charAt(k)){
                j++;k++;
            }else{
                return false;
            }
        }
        if(i<f.length() || j<s.length()){
            return false;
        }
        return true;

    }

    public static String sortString(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        s = String.valueOf(ch);
        return s;
    }
}
