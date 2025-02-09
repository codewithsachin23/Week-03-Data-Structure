package com.problemstatement.comparingdifferentdatastructuresforsearching;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};

        for (int size : sizes) {

            // Generate random dataset
            int[] array = new int[size];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();
            Random random = new Random();
            //Assign data
            for (int i = 0; i < size; i++) {
                int num = random.nextInt(size);
                array[i] = num;
                hashSet.add(num);
                treeSet.add(num);
            }

            // Select a random key to search
            int key = array[random.nextInt(size)];

            //Measure Linear Search time
            long startTime = System.nanoTime();
            SearchComparisonUsingSet.searchArray(array, key);
            long arraySearchTime = System.nanoTime() - startTime;

            //Measure HashSet Search time
            startTime = System.nanoTime();
           SearchComparisonUsingSet.searchHashSet(hashSet, key);
            long hashSetSearchTime = System.nanoTime() - startTime;

            //Measure TreeSet Search time
            startTime = System.nanoTime();
             SearchComparisonUsingSet.searchTreeSet(treeSet, key);
            long treeSetSearchTime = System.nanoTime() - startTime;

            // Print results for comparison
            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " + arraySearchTime / 1000000.0 + " ms");
            System.out.println("HashSet Search Time: " + hashSetSearchTime / 1000000.0 + " ms");
            System.out.println("TreeSet Search Time: " + treeSetSearchTime / 1000000.0 + " ms");
            System.out.println("*************************************************************************");
        }


    }
}
