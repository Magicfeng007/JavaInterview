package com.magic.javaInterview.ch9;

public class InnerClassTest implements Cloneable {

    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass("nnn");
        InnerClassTest innerClassTest = new InnerClassTest();
        PublicClss p = innerClassTest.createPublicClass();

    }

    public static class StaticClass{
        private String n;

        public StaticClass(String n) {
            this.n = n;
        }

        public String getN() {
            return n;
        }

        public void setN(String n) {
            this.n = n;
        }
    }

    public class PublicClss{
        private String cc;

        public PublicClss() {
        }

        public PublicClss(String cc) {
            this.cc = cc;
        }

        public String getCc() {
            return cc;
        }

        public void setCc(String cc) {
            this.cc = cc;
        }
    }

    public PublicClss createPublicClass(){
        PublicClss p = new PublicClss();
        return p;
    }
}
