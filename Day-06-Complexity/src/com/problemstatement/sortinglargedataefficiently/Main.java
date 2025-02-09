package com.problemstatement.sortinglargedataefficiently;

public class Main {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
//fill array with random number
        for (int size : sizes) {
            int[] data = new int[size];
            for (int i = 0; i < size; i++) {
                data[i] = (int) (Math.random() * size) + 1;
            }
            System.out.println("Data Size " + size);

            long startTime = System.nanoTime();
            SortingLargeDataEfficiently.bubbleSort(data);
            long endTime = System.nanoTime();
            System.out.println("Total time " + (endTime - startTime) / 1000000.0 + " ms");

            startTime = System.nanoTime();
            SortingLargeDataEfficiently.margeSort(data, 0, data.length - 1);
            endTime = System.nanoTime();
            System.out.println("Total time " + (endTime - startTime) / 1000000.0 + " ms");

            startTime = System.nanoTime();
            SortingLargeDataEfficiently.quickSort(data, 0, data.length - 1);
            endTime = System.nanoTime();
            System.out.println("Total time " + (endTime - startTime) / 1000000.0 + " ms");

            System.out.println("-------------------------------------------------------------------");

        }
    }
}
