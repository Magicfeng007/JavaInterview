package com.magic.javaInterview.ch5;

import java.math.BigDecimal;

public class PlusPlusJplusplus {
    public static void main(String[] args){
        int i = 0;
        i = i++ + ++i;
        int j = 0;
        j = ++j + j++ + j++ + j++;
        int k = 0;
        k = k++ + k++ + k++ + ++k;
        int h = 0;
        h = ++h + ++h;
        int p1 = 0,p2 = 0,q1 = 0,q2 = 0;
        q1 = ++p1;
        q2 = p2++;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(h);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(q1);
        System.out.println(q2);

        short s = Short.MAX_VALUE;
        byte b = Byte.MAX_VALUE;
        short ss = b;
        System.out.println(s);

        char c = '罷';

        boolean b2 = false;

        double d = 2.0d;

        int iii = Character.getNumericValue('A');
        System.out.println(iii);


    }

}
