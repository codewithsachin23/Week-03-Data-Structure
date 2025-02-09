package com.problemstatement.largefilereadingefficiency;

public class Main {
    public static void main(String[] args) {

        String [] fileSize={"file_1mb.txt","file_100mb.txt","file_500mb.txt"};
        for (int i=0;i<fileSize.length;i++){
            System.out.println("Data Size " + fileSize[i]);

            long startTime = System.nanoTime();
           FileReading.fileReader(fileSize[i]);
            long endTime = System.nanoTime();
            System.out.println("Total time " + (endTime - startTime) / 1000000.0 + " ms");

            startTime = System.nanoTime();
            FileReading.inputStreamReader(fileSize[i]);
            endTime = System.nanoTime();
            System.out.println("Total time " + (endTime - startTime) / 1000000.0 + " ms");


            System.out.println("-------------------------------------------------------------------");

        }
    }
}
