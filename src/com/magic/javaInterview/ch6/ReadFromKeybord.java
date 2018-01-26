package com.magic.javaInterview.ch6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromKeybord {
    public static void main(String[] args){
        ReadFromKeybord readFromKeybord = new ReadFromKeybord();
        readFromKeybord.readFromKeybord();
    }

    public void readFromKeybord(){
        int i1 = 0;
        int i2 = 0;

        try {
            System.out.println("请输入第一个整数：");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String line = bufferedReader.readLine();
            i1 = Integer.parseInt(line);

            System.out.println("转换为整数后的第一个整数：" + i1);

            System.out.println("请输入第二个整数：");
            String line2 = bufferedReader.readLine();
            i2 = Integer.parseInt(line2);
            System.out.println("转换为整数后的第一个整数：" + i2);

        }catch (IOException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("输入有误，请重新输入!!!");
            readFromKeybord();
        }
        System.out.println("他们的平方和为：" + (i1*i1 + i2*i2));
    }

    public void readFromKeybordBySystemIn(){
        int i1 = 0;
        int i2 = 0;

        try {
            System.out.println(System.in);
            System.out.println("请输入第一个整数：");
            byte[] bytes = new byte[1];
            System.in.read(bytes);
            String line = new String(bytes);
            i1 = Integer.parseInt(new String(bytes));
            System.out.print("第一个整数：" + line);
            System.out.print("转换为整数后的第一个整数：" + i1);

            System.out.print("请输入第二个整数：");
            bytes = new byte[1];
            System.in.reset();
            System.in.read(bytes);
            String line2 = new String(bytes);
//            i2 = Integer.parseInt(new String(bytes));
            System.out.print("第二个整数：" + line2);

        }catch (IOException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("输入有误，请重新输入：");
            readFromKeybord();
        }
        System.out.println(i1*i1 + i2*i2);
//        System.console().printf("%d",Integer.parseInt(new String(bytes)));
    }
}
