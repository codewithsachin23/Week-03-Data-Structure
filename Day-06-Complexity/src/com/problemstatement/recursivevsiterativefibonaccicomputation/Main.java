package com.problemstatement.recursivevsiterativefibonaccicomputation;


public class Main {
    public static void main(String[] args) {
        int dataSize[]={10,30,50};

        for (int data:dataSize){

            System.out.println("Data Size " + data);

            long startTime = System.nanoTime();
            System.out.println("Fib of given Data "+ComparisonOfRecursiveAndIterative.fibonacciRecursive(data));
            long endTime = System.nanoTime();
            System.out.println("Total time " + (endTime - startTime) / 1000000.0 + " ms");

            startTime = System.nanoTime();
            ComparisonOfRecursiveAndIterative.fibonacciIterative(data);
            endTime = System.nanoTime();
            System.out.println("Total time " + (endTime - startTime) / 1000000.0 + " ms");


            System.out.println("-------------------------------------------------------------------");

        }
    }
}
