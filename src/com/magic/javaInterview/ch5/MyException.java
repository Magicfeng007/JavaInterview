package com.magic.javaInterview.ch5;

import com.magic.javaInterview.ch5.exception.CoreException;
import com.magic.javaInterview.ch5.exception.CoreRuntimeException;

public class MyException {

    private int c;
    private String name;

    MyException(int cc){c = cc;}
    MyException(){}

    public static void main(String[] args){
//        testException();
        /*try {
            testCoreException();
        } catch (CoreException e) {
            e.printStackTrace();
        }*/
//        testCoreRuntimeException();

        /*try {
            testTryCatchFinallyException();
        } catch (CoreException e) {
            e.printStackTrace();
        }*/

        MyException exception = new MyException();
        System.out.println(exception.c);
        System.out.println(exception.name);

        /*try {
            testTryFinallyException();
        } catch (CoreException e) {
            e.printStackTrace();
        }*/
    }

    public static void testException(){
        System.out.println("xxxx");
        throw new NullPointerException("null point exception");
    }

    public static void testCoreException() throws CoreException {
        System.out.println("xxxx");
        try{
            throw new CoreException();
        }catch (CoreException e){
            throw e;
        }finally {
            System.out.println("yyyy");
        }
    }

    public static void testTryCatchFinallyException() throws CoreException {
        System.out.println("xxxx");
        try{
            throw new CoreException();
        }catch (CoreException e){
            throw e;
        }finally {
            System.out.println("yyyy");
        }
    }

    public static void testTryFinallyException() throws CoreException {
        System.out.println("xxxx");
        try{
            throw new CoreException();
        }finally {
            System.out.println("zzzz");
        }
    }

    public static void testCoreRuntimeException() {
        System.out.println("xxxx");
        throw new CoreRuntimeException();
    }
}
