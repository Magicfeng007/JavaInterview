package com.magic.javaInterview.ch9;

import com.magic.javaInterview.ch6.Person;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test");
        Map<String,Person> map = new HashMap<>();
        Person p1 = new Person("df","dsfd",12,3);
        map.put("1",p1);
        map.put("2",p1);
        System.out.println(map.size());

        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p1);
        System.out.println(set.size());

        List<Person> list = new ArrayList<>();
        /*for(int i=0;i<10000;i++){
            list.add(new Person("pname" + i,i%2==0?"male":"female",i,i*i));
        }

        for(int i=0;i<10000;i++){
            System.out.println(list.get(i));
        }*/

        List<Person> vList = new Vector<>();

        Map<String,String> m1 = new HashMap<>();
        for(int i=0;i<3;i++){
            m1.put(String.valueOf(System.nanoTime()),String.valueOf(i));
        }
        for (Map.Entry<String, String> e:
        m1.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue()) ;
        }

    }

    static class one{
        private static class two{
            public static void main(String[] args) {
                System.out.println("two");
            }
        }
    }
}
