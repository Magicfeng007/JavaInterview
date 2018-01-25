package com.magic.javaInterview.ch6;

import java.io.IOException;
import java.io.InputStream;

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
            byte[] bytes = new byte[1];
            System.in.read(bytes);
            String line = new String(bytes);
//            i1 = Integer.parseInt(new String(bytes));
            System.out.print("第一个整数：" + line);

            System.out.print("请输入第二个整数：");
            bytes = new byte[1];
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
