package com.magic.javaInterview.easyErr;

public class FindOdd {
    public static void main(String[] args){
        for(int i=-10;i<10;i++){
            System.out.println(isOdd(i)?i:"");
            System.out.println(i%2==0?"":i);
        }
    }

    /**
     * 查找整数的奇数，奇数包括正奇数和负奇数
     * @param i 整数
     * @return 是否是奇数
     */
    public static boolean isOdd(int i){
        if(i%2 == 1  || i%2==-1) return true;
        return false;
    }

    public static boolean isEven(int i){
        return i%2 == 0;
    }
}
