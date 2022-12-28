package com.company;

import java.util.Arrays;

public class WordWrap {
    public static int t[][] = new int[100][100];

    public static void main(String[] args) {
        for (int[] arr : t){
            Arrays.fill(arr,-1);
        }
        int[] nums = {3,2,2,5};
        int k=6;
        System.out.println("The minimum cost : "+ WordWrap(nums, k,0,k));
    }
    public static int WordWrap(int[] nums,int length, int wordIndex, int remlen){
        if (t[wordIndex][remlen] != -1){
            return t[wordIndex][remlen];
        }
        if (wordIndex == nums.length-1){
            return t[wordIndex][remlen] = nums[wordIndex]<length ?0:(int)Math.pow(remlen,2);
        }

        if (nums[wordIndex] < remlen){
            int same_line = WordWrap(nums,length,wordIndex+1,remlen==length? remlen-nums[wordIndex]:remlen-nums[wordIndex]-1);
            int next_line = (int)Math.pow(remlen,2) + WordWrap(nums,length,wordIndex+1,length-nums[wordIndex]);
            return t[wordIndex][remlen] = Math.min(same_line,next_line);
        }else{
            return  t[wordIndex][remlen] =(int)Math.pow(remlen,2)+ WordWrap(nums,length,wordIndex+1,remlen-nums[wordIndex]);
        }

    }
//    public static int findWordWrap(int[] nums, int n, int wordIndex, int length, int remainLength){
//        if (t[wordIndex][remainLength] != -1){
//            return t[wordIndex][remainLength];
//        }
//
//        t[wordIndex][remainLength] = wordwrap(nums, n, wordIndex, length, remainLength);
//        return t[wordIndex][remainLength];
//    }
//
//    public static int wordwrap(int[] nums, int n, int wordIndex, int length, int remainLength){
//        if (wordIndex == n-1){
//            t[wordIndex][remainLength] = nums[wordIndex] < remainLength ? 0 : (int)Math.pow(remainLength,2);
//            return t[wordIndex][remainLength];
//        }
//
//        if (nums[wordIndex] < remainLength){
//            return Math.min(
//              findWordWrap(nums, n, wordIndex+1, length, remainLength==length ? length-nums[wordIndex] :remainLength-nums[wordIndex]-1),
//                    findWordWrap(nums, n, wordIndex+1, length, length-nums[wordIndex]) + (int)Math.pow(remainLength,2)
//            );
//        }else{
//            return findWordWrap(nums, n, wordIndex+1, length, length-nums[wordIndex]);
//        }
//
//    }
}
