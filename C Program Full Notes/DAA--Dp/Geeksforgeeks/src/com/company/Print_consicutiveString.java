package com.company;

public class Print_consicutiveString {
    public static void main(String[] args) {
        String s = "1010110010";
        System.out.println("No of substrings with equal number of zero and one is: "+splitString(s));
    }
    public static int splitString(String s){
        int count=0,count0 = 0, count1 = 0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) == '0'){
                count0++;
            }else if(s.charAt(i) == '1'){
                count1++;
            }

            if(count0 == count1){
                count++;
            }

        }
        if(count0 == 0 || count1 == 0){
            return -1;
        }
        return count;
    }
}
