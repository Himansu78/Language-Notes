package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    //Fractional Knapsack

    public static void main(String[] args) {
	// write your code here
        int[] val = {10,5,15,7,6,18,3};
        int[] wt = {2,3,5,7,1,4,1};
        int maxWt = 15;
        double profit = fractionalKnapsack(val, wt , maxWt);
        System.out.print("The max profit is:");
        System.out.printf("%.2f",profit);
    }

    public static double fractionalKnapsack(int[] val, int[] wt, int W){
        Item[] items = new Item[wt.length];

        for (int i=0;i<wt.length;i++){
            items[i] = new Item(wt[i],val[i],i);
        }

        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2)
            {
                return o2.cost.compareTo(o1.cost);
            }
        });

        double totalProfit = 0d;

        for(Item item:items){
            if(W- item.wt >= 0){
                totalProfit += item.val;
                W -= item.wt;
            }else{
                double fraction = (double)W / (double)item.wt;
                totalProfit += item.val*fraction;
               // W = (int)(W - item.wt*fraction);
                break;
            }
        }

        return totalProfit;

    }

}

class Item{
    Double cost;
    int wt, val, index;
    public Item(int wt, int val, int index){
        this.wt = wt;
        this.val = val;
        this.index = index;
        cost = new Double((double)val / (double)wt);
    }
}