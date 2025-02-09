package com.problemstatement.largefilereadingefficiency;
import java.io.*;


public class FileReading {
    public static void fileReader(String file){
        try {
            //read a file
            FileReader fileReader=new FileReader(file);
            //warp file reader in buffer reader
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;

            while ((line=bufferedReader.readLine())!=null){

            }
            bufferedReader.close();
            fileReader.close();


        }catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }public static void inputStreamReader(String file){
        try {
               FileInputStream fileInputStream=new FileInputStream(file);
                InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
                String line;
                while ((line=bufferedReader.readLine())!=null) {

                }

                fileInputStream.close();
                inputStreamReader.close();
                bufferedReader.close();
            }catch (FileNotFoundException e){
                System.out.println("File not found" +file);
            }catch (IOException e){
                System.out.println("error to read input "+e.getMessage());
            }
        }

}
