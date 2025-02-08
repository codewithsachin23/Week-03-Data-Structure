package com.problemstatement.searchtargetinlargedataset;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Dataset sizes
        int[] sizes = {1000, 10000, 1000000};
        int target = 999;
//fill array with random number
        for (int size : sizes) {
            int[] data = new int[size];
            for (int i = 0; i < size; i++) {
                data[i] = (int)(Math.random()*size)+1;
            }

            System.out.println("Dataset Size: " + size);

            // Linear Search Timing
            long startTime = System.nanoTime();
            SearchingComparison.linearSearch(data, target);
            long endTime = System.nanoTime();
            System.out.println("Linear Search Time: " + (endTime - startTime)/1000000.0 + " ms");

            // Binary Search Timing (Sort first)
            Arrays.sort(data);
            startTime = System.nanoTime();
            SearchingComparison.binarySearch(data, target);
            endTime = System.nanoTime();
            System.out.println("Binary Search Time: " + (endTime - startTime)/1000000.0 + " ms");

            System.out.println("--------------------");
        }
    }
}
