package com.magic.javaInterview.ch9;

import java.util.HashMap;

public class HashMapNotSafeTest {
    public static void main(String[] args) {
        testHashMapNotSafe();
    }

    public static void testHashMapNotSafe() {
        final HashMap<String, String> firstHashMap = new HashMap<String, String>();
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    firstHashMap.put(String.valueOf(i), String.valueOf(i));
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int j = 1000; j < 2000; j++) {
                    firstHashMap.put(String.valueOf(j), String.valueOf(j));
                }
            }
        };

        t1.start();
        t2.start();
        //主线程休眠1秒钟，以便t1和t2两个线程将firstHashMap填装完毕。
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //如果key和value不同，说明在两个线程put的过程中出现异常。
        for (int l = 0; l < 1000; l++)
            if (!String.valueOf(l).equals(firstHashMap.get(String.valueOf(l)))) {
                System.err.println(String.valueOf(l) + ":" + firstHashMap.get(String.valueOf(l)));
            }
    }
}
