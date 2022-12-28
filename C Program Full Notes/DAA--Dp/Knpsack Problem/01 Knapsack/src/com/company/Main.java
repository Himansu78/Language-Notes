package com.company;

class calc{
    int n1;
    int n2;
    int r;
    public void perform(){
        r = n1+n2;
        System.out.println(r);
    }
}



public class Main {

    public static void main(String[] args) {
        // write your code here
        calc c=new calc();
        c.n1=2;
        c.n2=3;
        System.out.println(c.r);
        c.perform();
    }
}
