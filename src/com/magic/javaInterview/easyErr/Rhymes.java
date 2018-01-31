package com.magic.javaInterview.easyErr;

import java.util.Random;

public class Rhymes {
    private static Random rnd = new Random();
    /**
     * 以下程序的输出有可能是什么?
     * (a) Pain ,Gain 或者 Main (根据各个随机数)
     * (b) Pain 或者 Main (根据随机数)
     * (c) Main (总是这个)
     * (d) 以上都不对
     */
    public static void main(String[] args) {
        StringBuffer word = null;
        switch (rnd.nextInt(2)) {
            case 1: word = new StringBuffer('P');
            case 2: word = new StringBuffer('G');
            default: word = new StringBuffer('M');
        }
        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println(word);
    }
}
