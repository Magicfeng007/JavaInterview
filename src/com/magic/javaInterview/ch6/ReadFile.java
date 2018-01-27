package com.magic.javaInterview.ch6;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args){
        ReadFile readFile = new ReadFile();
        long start = System.currentTimeMillis();
//        readFile.bufferedReaderReadRile("/home/magic/workspace/housing2.py");
//        readFile.bufferedReaderReadRile2("/home/magic/workspace/housing2.py");
//        readFile.fileInputStreamReadRile("/home/magic/workspace/housing2.py");
        readFile.inputStreamReaderReadRile("/home/magic/workspace/housing2.py");
//        readFile.fileReaderReadRile("/home/magic/workspace/housing2.py");
//        readFile.randomAccessFileReadRile("/home/magic/workspace/housing2.py");
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public void bufferedReaderReadRile(String path){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            while (bufferedReader.ready())System.out.println(bufferedReader.readLine());
            bufferedReader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void bufferedReaderReadRile2(String path){
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            while (bufferedReader.ready())System.out.println(bufferedReader.readLine());
            bufferedReader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void fileInputStreamReadRile(String path){
        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            byte[] bytes = new byte[1];
            while(fileInputStream.read(bytes) != -1){
                System.out.print(new String(bytes).toString());
            }
            fileInputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void inputStreamReaderReadRile(String path){
        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            while (inputStreamReader.ready()){
                char[] chars = new char[1];
                inputStreamReader.read(chars);
                System.out.print(new String(chars).toString());
            }
            fileInputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void fileReaderReadRile(String path){
        try{
            FileReader fileReader = new FileReader(path);
            while (fileReader.ready()){
                char[] chars = new char[1];
                fileReader.read(chars);
                System.out.print(new String(chars).toString());
            }
            fileReader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void randomAccessFileReadRile(String path){
        try{
            RandomAccessFile randomAccessFile = new RandomAccessFile(path,"rw");
            String line = null;
            while ((line = randomAccessFile.readLine()) != null){
                System.out.println(line);
            }
            randomAccessFile.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public Object readerObjectFromFile(String filePath, String fileName){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath + File.separator + fileName));
            return objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}