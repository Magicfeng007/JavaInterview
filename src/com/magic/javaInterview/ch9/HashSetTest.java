package com.magic.javaInterview.ch9;

import com.magic.javaInterview.ch6.Person;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashSetTest {
    private static final String[] URLNAMES = {
            "http://www.sina.com.cn",//222.76.214.60
            "http://www.nwu.edu.cn",//121.194.14.85
            "http://javapuzzlers.com",//208.113.219.15
            "http://www.google.com",//174.37.54.20
            "http://Javapuzzlers.com",//208.113.219.15
            //"http://apache2-snort.skybar.dreamhost.com"//无法解析
    };
    public static void main(String[] args) throws MalformedURLException{
        /*Set<URL> urls = new HashSet<>();
        for (String url :
                URLNAMES) {
            urls.add(new URL(url));
        }

        for (URL url :
                urls) {
            System.out.println(url+ " : " +  url.getHost() + " ref:" + url.getRef());
        }

        System.out.println(urls.size());

        if(null == null){
            System.out.println("null == null");
        }*/

        Person p1 = new Person("p1","male",12,0);
        Person p2 = new Person("p1","male",12,0);
        System.out.println(p1.equals(p2));
        Set<Person> people = new HashSet<>();
        people.add(p1);
        people.add(p2);
        System.out.println(people.size());
        Person p3 = new Person("p3","female",32,20000);

        Map<String,Person> hashtable = new Hashtable<>();
        hashtable.put(null,new Person());

    }
}
