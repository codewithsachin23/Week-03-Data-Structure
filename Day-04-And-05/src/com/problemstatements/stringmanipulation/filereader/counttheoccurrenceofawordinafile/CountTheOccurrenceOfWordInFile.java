package com.problemstatements.stringmanipulation.filereader.counttheoccurrenceofawordinafile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountTheOccurrenceOfWordInFile {
    public static void main(String[] args) {
        //storing a file in a string
        String file="OccurrenceOfWord.txt";
        String targetWord="Java";
        int count=0;
        try {

            //read a file
            FileReader fileReader=new FileReader(file);
            //warp file reader using buffer reader
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            String line;
            while ((line=bufferedReader.readLine())!=null){
                String []words=line.split(" ");
                for (String word:words){
                    if (word.equals(targetWord)){
                        count++;
                    }
                }
            }

            System.out.println("The word " +targetWord +" occur "+ count +" times in file");

        }catch (FileNotFoundException e){
            System.out.println("file not found"+ file);
        } catch (IOException e){
            System.out.println("Error reading the file:"+ e.getMessage());
        }
    }
}
