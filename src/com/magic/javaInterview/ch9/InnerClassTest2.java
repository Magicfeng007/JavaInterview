package com.magic.javaInterview.ch9;

public class InnerClassTest2 {
    public static void main(String[] args) {
        InnerClassTest innerClassTest = new InnerClassTest();
        InnerClassTest.PublicClss  p = innerClassTest.createPublicClass();
//        InnerClassTest.PublicClss  p2 = new InnerClassTest.PublicClss("dsf");/编译错误，无法访问
        InnerClassTest.PublicClss p2 = innerClassTest.createPublicClass();
        InnerClassTest.StaticClass staticClass = new InnerClassTest.StaticClass("fdf");
    }
}
