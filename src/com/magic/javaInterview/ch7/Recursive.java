package com.magic.javaInterview.ch7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursive {
    private static List<String> initQueue = new ArrayList<>();
    private static List<String> midQueue = new ArrayList<>();
    private static List<String> tempQueue = new ArrayList<>();

    static{
        initQueue.add("1");
        initQueue.add("2");
        initQueue.add("3");
        initQueue.add("4");
        initQueue.add("5");

        midQueue.add("1");
        midQueue.add("2");
        midQueue.add("3");
        midQueue.add("4");
        midQueue.add("5");

        tempQueue.add("1");
        tempQueue.add("2");
        tempQueue.add("3");
        tempQueue.add("4");
        tempQueue.add("5");


    }
    public static void main(String[] args) {
//        printArrayCombination();
        System.out.println(Math.pow(initQueue.size(),3));
    }

    public static void printArrayCombination(){

        for (int i = 1; i<= initQueue.size(); i++){
            for(int j = 1; j<=Math.pow(initQueue.size(),i); j++){
                System.out.print(initQueue.get(j-1) + " / ");
            }
            System.out.println();
        }
    }

    public int power(int i , int j){
        int result = 0;
        for(int k = 1;k<=j;k++){
            result += 0;
        }
        return 0;
    }

    /**
     * 1 2 3 4 5      ---------n^1
     * 11 12 13 14 15
     * 21 22 23 24 25
     * 31 32 33 34 35
     * 41 42 43 44 45
     * 51 52 53 54 55 ---------n^2
     * .
     * ..
     * ...            ---------n^n
     *=n^1 + n^2 + ... + n^n  （个）
     *
     *
     *
     *
     */
}
