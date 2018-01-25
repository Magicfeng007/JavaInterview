package com.magic.javaInterview.ch5.finalFinallyFinalize;

public class Person {
    private String name;
    private int age;
    private final String gender;
    private Tool tool;

    public Person(String name, int age, String gender, final Tool tool) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.tool = tool;
        tool.setName("habagou");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public Tool getTool() {
        return tool;
    }

    public void changeFinalTool(final Tool tool){
        tool.setName("after change...");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", tool=" + tool +
                '}';
    }

    protected void finalize(){
        System.out.println("Person's finalize is called");
    }
}
