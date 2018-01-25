package com.magic.javaInterview.ch6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args){
        WriteFile writeFile = new WriteFile();
        writeFile.writeStringToFile("testWriteStringToFile","/home/magic/test/testWrite/");
    }

    public void writeStringToFile(String str,String filePath){
        File file = new File(filePath);
        BufferedWriter bufferedWriter = null;
        try{
            if (file.exists()){
                if(file.isDirectory()){
                    File targetFile = new File(file.getPath() + "/myfile.txt");
                    if(targetFile.exists() && targetFile.isFile()){
                        bufferedWriter = new BufferedWriter(new FileWriter(targetFile,true));
                        bufferedWriter.newLine();
                        bufferedWriter.append(str);
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    }else {
                        bufferedWriter = new BufferedWriter(new FileWriter(file.getPath() + "/myfile.txt"));
                        bufferedWriter.write(str);
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    }
                }
            }else {
                file.mkdirs();
                bufferedWriter = new BufferedWriter(new FileWriter(file.getPath() + "/myfile.txt"));
                bufferedWriter.write(str);
                bufferedWriter.flush();
                bufferedWriter.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
