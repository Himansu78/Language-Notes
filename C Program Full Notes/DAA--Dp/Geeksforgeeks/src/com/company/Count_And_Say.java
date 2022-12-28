package com.company;

public class Count_And_Say {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
    public static String countAndSay(int n) {
        if(n==1){
            return "1";
        }

        if(n==2){
            return "11";
        }

        String s = countAndSay(n-1);
        String result = "";
        int count=1;
        for(int i=0;i<s.length();i++){
            for (int j=i;j<s.length()-1;j++){
                if(s.charAt(j) == s.charAt(j+1)){
                    count++;
                }else{
                    break;
                }
            }
            result = result + count + Character.toString(s.charAt(i));
            i = i+count-1;
            count = 1;
        }
        return result;
    }

}
