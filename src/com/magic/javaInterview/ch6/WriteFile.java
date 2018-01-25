package com.magic.javaInterview.ch6;

import java.io.*;

public class WriteFile {
    public static void main(String[] args){
        WriteFile writeFile = new WriteFile();
//        writeFile.writeStringToFileByFileWriter("testWriteStringToFile","/home/magic/test/testWrite/");
        writeFile.writeStringToFIleByFileOutputStream("testWriteStringToFile","/home/magic/test/testWrite/","myfile.txt");
    }

    public void writeStringToFileByFileWriter(String str,String filePath,String fileName){
        File file = new File(filePath);
        BufferedWriter bufferedWriter = null;
        try{
            if (file.exists()){
                if(file.isDirectory()){
                    File targetFile = new File(file.getPath() + File.separator + fileName);
                    if(targetFile.exists() && targetFile.isFile()){
                        bufferedWriter = new BufferedWriter(new FileWriter(targetFile,true));
                        bufferedWriter.newLine();
                        bufferedWriter.append(str);
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    }else {
                        bufferedWriter = new BufferedWriter(new FileWriter(file.getPath() + File.separator + fileName));
                        bufferedWriter.write(str);
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    }
                }
            }else {
                file.mkdirs();
                bufferedWriter = new BufferedWriter(new FileWriter(file.getPath() + File.separator + fileName));
                bufferedWriter.write(str);
                bufferedWriter.flush();
                bufferedWriter.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void writeStringToFIleByFileOutputStream(String str,String filePath,String fileName){
        File file = new File(filePath);
        BufferedWriter bufferedWriter = null;
        try{
            if (file.exists()){
                if(file.isDirectory()){
                    File targetFile = new File(file.getPath() + File.separator + fileName);
                    if(targetFile.exists() && targetFile.isFile()){
                        OutputStream outputStream = new FileOutputStream(file.getPath() + File.separator + fileName,true);
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
                        bufferedWriter = new BufferedWriter(outputStreamWriter);
                        bufferedWriter.newLine();
                        bufferedWriter.append(str);
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    }else {
                        OutputStream outputStream = new FileOutputStream(file.getPath() + File.separator + fileName);
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
                        bufferedWriter = new BufferedWriter(outputStreamWriter);
                        bufferedWriter.write(str);
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    }
                }
            }else {
                file.mkdirs();
                OutputStream outputStream = new FileOutputStream(file.getPath() + File.separator + fileName);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
                bufferedWriter = new BufferedWriter(outputStreamWriter);
                bufferedWriter.write(str);
                bufferedWriter.flush();
                bufferedWriter.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
