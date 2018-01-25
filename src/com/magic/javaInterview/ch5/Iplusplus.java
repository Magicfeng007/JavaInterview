package com.magic.javaInterview.ch5;

public class Iplusplus {
    static {
        int x = 5;
    }
    static int x,y;
    public static void main(String[] args){
        System.out.println(x);
        x--;
        myMethod();
        System.out.println(x + y++ + x);
    }
    public static void myMethod(){
        y = x++ + ++x;
    }
}
