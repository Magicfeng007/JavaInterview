package com.magic.javaInterview.easyErr;

public class SimpleDoubleAndFloat {
    /**
     * 在《Effective Java》这本书中提到一个原则，float和double只能用来做科学计算或者是工程计算，在商业计算中我们要用 java.math.BigDecimal来解决
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(2.0 - 1.9);
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        System.out.println(4.015*100);
        System.out.println(123.3/100);
        System.out.println(1.0/10.0);


    }
}
