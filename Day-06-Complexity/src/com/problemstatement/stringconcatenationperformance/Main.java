package com.problemstatement.stringconcatenationperformance;
public class Main {
    public static void main(String[] args) {
        int dataSet[]={1000,100000,1000000};
        String string="Hello";
        for (int data:dataSet){
            System.out.println("Data Size " + data);

            long startTime = System.nanoTime();
            StringComparison.stringConcat(string,data);
            long endTime = System.nanoTime();
            System.out.println("Total time " + (endTime - startTime) / 1000000.0 + " ms");

            startTime = System.nanoTime();
            StringComparison.stringBuilderConcat(string,data);
            endTime = System.nanoTime();
            System.out.println("Total time " + (endTime - startTime) / 1000000.0 + " ms");

            startTime = System.nanoTime();
            StringComparison.stringBufferConcat(string,data);
            endTime = System.nanoTime();
            System.out.println("Total time " + (endTime - startTime) / 1000000.0 + " ms");


            System.out.println("-------------------------------------------------------------------");

        }
    }
}
