package com.magic.javaInterview.ch5;

public class ThreeMeshOperation {
    public static void main(String[] args){
        boolean a = true ? false : true == true ? false : true;
        boolean b = (true ? false : true == true) ? false : true;
        System.out.println(a);
        System.out.println(b);
        System.out.println("sdfds" + (10+9));
        System.out.println("sdfds" + 10+9);

        int aa = 5;
        System.out.println("sdfds" + ((aa < 5) ? 10.9 : 9));

        System.out.println(true?9:10.0);

        char x = 'x';
        int i = 10;
        System.out.println(true ? 33 : x);
        System.out.println(true ? 33 : 'x');
        System.out.println(false ? 33 : 'x');
        System.out.println(false ? 327680 : x);
        System.out.println(false ? 32768 : x);
        System.out.println(false ? i : x);
        System.out.println(false ? 327680 : Character.MAX_VALUE);


    }
}
