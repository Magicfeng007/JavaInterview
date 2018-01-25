package com.magic.javaInterview.ch5;

public class RightMove {
    public static void main(String[] args){
        int i = 2;
        System.out.println(i >> 32);

        long l = 2;
        System.out.println(l >> 32);

        long l1 = 2;
        System.out.println(l1 >> 64);
    }
}
