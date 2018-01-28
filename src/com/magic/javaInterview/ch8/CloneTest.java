package com.magic.javaInterview.ch8;

import java.util.Date;

public class CloneTest implements Cloneable {

    private int i = 100;
    private Date hireDate = new Date(1900, 11, 8, 12, 0, 0);

    public static void main(String[] args) {
        CloneTest cloneTest = new CloneTest();
        System.out.println(cloneTest.hireDate.getTime());
        CloneTest test = null;
        try {
            test = (CloneTest) cloneTest.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(test.hireDate.getTime());
        test.getHireDate().setDate(10);
        System.out.println(cloneTest.hireDate.getTime());
        System.out.println(test.hireDate.getTime());

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * 深拷贝
     *
     * @return Object
     */
    @Override
    public CloneTest clone() throws CloneNotSupportedException{
        Object obj = null;
        obj = super.clone();
        CloneTest copy = (CloneTest) obj;
        copy.setHireDate((Date) copy.getHireDate().clone());
        return copy;
    }

    /**
     * 浅拷贝
     */
    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/
}
