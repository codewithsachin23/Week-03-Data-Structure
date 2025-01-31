package com.sorting.countingsort.sortstudentage;

public class CountingSort {
    public void countingSort(int arr[], int minAge, int maxAge) {
        int range = maxAge - minAge + 1;
        int count[] = new int[range];
        int output[] = new int[arr.length];

        // Step 1: Count occurrences
        for (int age : arr) {
            count[age - minAge]++;
        }

        // Step 2: Compute cumulative frequencies
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place elements in sorted order
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - minAge] - 1] = arr[i];
            count[arr[i] - minAge]--;
        }

        // Step 4: Copy sorted elements back to original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

}
