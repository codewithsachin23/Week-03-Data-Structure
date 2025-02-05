package com.problemstatements.stringmanipulation.inputstreamreader.writetofileusinginputstreamreader;

import java.io.*;

public class ReadUserInputAndWriteToFileUsingInputStreamReader {
    public static void main(String[] args) {
        String file="FileWriter.txt";
        try {
            //creating input stream reader that read a input from the file
            InputStreamReader inputStreamReader=new InputStreamReader(System.in);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

            //this is file writer it use to write input into file
            FileWriter fileWriter=new FileWriter(file, true);
            String input;
            while (!(input=bufferedReader.readLine()).equals("exit")){
                fileWriter.write(input + System.lineSeparator());
            }
            //it helps to write  input into file
            fileWriter.flush();
            System.out.println("input write on file"+file);

            inputStreamReader.close();
            bufferedReader.close();
            fileWriter.close();

        }catch (FileNotFoundException e){
            System.out.println("File not found" +file);
        }
        catch (IOException e){
            System.out.println("error to read input " +e.getMessage());
        };

    }
}
