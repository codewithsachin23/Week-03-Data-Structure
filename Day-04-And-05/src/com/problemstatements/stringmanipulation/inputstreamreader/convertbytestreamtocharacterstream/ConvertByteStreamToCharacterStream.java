package com.problemstatements.stringmanipulation.inputstreamreader.convertbytestreamtocharacterstream;

import java.io.*;

public class ConvertByteStreamToCharacterStream {
    public static void main(String[] args) {
        String file="BinaryData.txt";
        String charSet="UTF-8";
        try {
            FileInputStream fileInputStream=new FileInputStream(file);
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream,charSet);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found" +file);
        }catch (IOException e){
            System.out.println("error to read input "+e.getMessage());
        }
    }
}
