package com.company;

import java.util.Scanner;

public class minBoxProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        //int row = sc.nextInt();

        System.out.print("Enter column: ");
        //int col = sc.nextInt();

        System.out.println("The minimum number of box: "+minimumBox(3, 7));
    }

    public static int minimumBox(int row, int col){
        int box_Count = 0;
        int min_box_taken = Math.min(row,col);

        int total_box = row*col;


        while(min_box_taken>0){
            int min_box = min_box_taken*min_box_taken;

            if (min_box<=total_box){
                total_box -= min_box;
                box_Count++;
            }else{
                min_box_taken--;
            }
        }
        return box_Count;
    }

    public static int minBox(int row, int col){
        //Time complexity n*n
        int box = 0;

        int low=col;
        if (row<col)
            low = row;

        int box_left = row*col;

        while(low*low <= box_left){
            box++;
            box_left -= low*low;
            if (box_left==0)
                break;
            while (low*low > box_left){
                --low;
            }

        }
        return box;
    }
}

