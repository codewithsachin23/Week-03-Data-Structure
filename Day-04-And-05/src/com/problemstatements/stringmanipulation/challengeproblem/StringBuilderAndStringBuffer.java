package com.problemstatements.stringmanipulation.challengeproblem;

public class StringBuilderAndStringBuffer {

    public static void compareTime(String str,int n){
        long startTime1=System.nanoTime();
        StringBuffer stringBuffer=new StringBuffer();
        for (int i=0;i<n;i++){
            stringBuffer.append(str);
        }
        long endTime1=System.nanoTime();

        long totalTimeUsedByBuffer=endTime1-startTime1;


        long startTime2=System.nanoTime();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<n;i++){
            stringBuilder.append(str);
        }
        long endTime2=System.nanoTime();
        long totalTimeUsedByBuilder=endTime2-startTime2;


        // Convert to milliseconds
        double timeBufferMillis = totalTimeUsedByBuffer / 1_000_000.0;
        double timeBuilderMillis = totalTimeUsedByBuilder / 1_000_000.0;

        // Output time taken
        System.out.println("Time taken by StringBuffer: " + timeBufferMillis + " ms");
        System.out.println("Time taken by StringBuilder: " + timeBuilderMillis + " ms");

        // Conclusion
        if (totalTimeUsedByBuffer > totalTimeUsedByBuilder) {
            System.out.println("StringBuilder is faster.");
        } else {
            System.out.println("StringBuffer is faster.");
        }

    }
    public static void main(String[] args) {
        int n=1000000;
        String str="Hello";
        compareTime(str,n);


    }
}
