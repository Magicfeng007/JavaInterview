package com.magic.javaInterview.ch5;

import java.io.FileNotFoundException;

public class PlusEquals {
    /**
     *  += 会把后面的数值自动强制转换为前面的类型，然后在那快内存上直接修改数值；
     *  = 是会在把后面的数值赋值到前面的变量时检测类型是否相同（ 非自动强制转换！）如果是高精度到低精度的，需要报错，告诉程序员会loss of data
     */
    public static void main(String[] args) throws FileNotFoundException {
        short s = 0;
        int i = 32768;//1000 0000 0000 0000
      int j = 32767;// 111 1111 1111 1111
      System.out.println(Integer.toBinaryString(j));
        s += i;
        //s = s + i;
        short s1 = 0 ;
        s1 += j;

        System.out.println((short)32768);
        System.out.println("s " + s);
        System.out.println(j);

        assert s < 0;

    }
}
