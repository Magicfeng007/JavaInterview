package com.magic.javaInterview.ch5.finalFinallyFinalize;

public class FinalTest {
    private final int Const1 = 0;
    private int Const2;


    public static void main(String[] args){
        Tool tool = new Tool("fengche",5);
        String gender = "male";
        int age = 2;
        Person p1 = new Person("Andy",age,gender,tool);
        System.out.println(p1);
        p1.setName("Bob");
        System.out.println(p1);
        age = 3;
        gender = "femal";
        tool.setName("dafengche");
        System.out.println(p1);



        Tool tool1 = new Tool("my tool",10);
        System.out.println(tool1);
        p1.changeFinalTool(tool1);
        System.out.println(tool1);
        p1 = null;
        System.gc();
    }

}
