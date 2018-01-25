package com.magic.javaInterview.ch5;

public class MClassLoader {
    public static void main(String[] args){
        //AppClassLoader
        System.out.println(MClassLoader.class.getClassLoader());
        System.out.println(MClassLoader.class);
        System.out.println(System.class.getClassLoader());


    }
}
