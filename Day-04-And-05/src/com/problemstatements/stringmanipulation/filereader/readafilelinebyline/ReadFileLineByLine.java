package com.problemstatements.stringmanipulation.filereader.readafilelinebyline;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        String file = "InputFile.txt";
        try {
            //read a file
            FileReader fileReader=new FileReader(file);
            //warp file reader in buffer reader
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;

            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();


        }catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

    }
}
