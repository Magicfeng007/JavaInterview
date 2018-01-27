package com.magic.javaInterview.ch6;

import java.util.ArrayList;
import java.util.List;

public class Serializable {
    private static final String filePath = "/home/magic/test/ch6";
    private static final String fileName = "Person.txt";

    public static void main(String args[]){
        List<Person> personList = new ArrayList<>();
        for (int i = 0 ; i < 100000;i ++){
            personList.add(new Person("Bob" + i,"male",i,i));
        }
        WriteFile writeFile = new WriteFile();
        writeFile.writeObjectToFileByFileOutputStream(personList,filePath,fileName);
        ReadFile readFile = new ReadFile();
        Person dPerson = null;
        List<Person> dPersonList = (List<Person>)readFile.readerObjectFromFile(filePath,fileName);
        for(int i = 0; i < 100000; i++){
            System.out.println((Person)dPersonList.get(i));
        }
    }
}
