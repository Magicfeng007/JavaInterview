package com.magic.javaInterview.ch5;

public class Jplusplus {
    public static void main(String[] args){
        Jplusplus();//0
        PlusplusJ();//100
        Jplus();
    }

    public static void Jplusplus(){
        int j = 0;
        for (int i=0;i<100;i++){
            j=j++;

            //java用了中间缓存变量机制 等价于以下代码
            /*
            int tmp = j;
            j=j+1;
            j=tmp;
            */
        }
        System.out.println(j);
    }

    public static void Jplus(){
        int j = 0;
        for (int i=0;i<100;i++){
            j++;

        }
        System.out.println(j);
    }

    public static void PlusplusJ(){
        int j = 0;
        for (int i=0;i<100;i++){
            j=++j;
        }
        System.out.println(j);
    }
}
