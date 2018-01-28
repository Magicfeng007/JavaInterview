package com.magic.javaInterview.ch7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAll implements Cloneable{
    public static void main(String[] args) {
        String[] array = new String[]{"1","2","3"};
        listAll(Arrays.asList(array),"");
        ListAll listAll = new ListAll();
    }

    public static void listAll(List<String> candidate, String prefix){
        System.out.println(prefix);
        for(int i=0;i < candidate.size();i++){
//            List temp = new LinkedList(candidate);
            List temp = new ArrayList(candidate);
            listAll(temp,prefix + temp.remove(i));
        }
    }
}
