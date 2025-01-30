package com.problemstatement.hashmapandhashfunction.checkforapairwithgivensuminanarray;

import java.util.HashSet;

public class CheckForAPairWithGivenSumInArray {
    // Method to check if there exists a pair with the given sum
    public static boolean hasPairWithSum(int[] arr, int target) {
        // Hash set to store visited numbers
        HashSet<Integer> visitedNumbers = new HashSet<>();


        for (int num : arr) {

            int complement = target - num;


            if (visitedNumbers.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return true;
            }

            // Otherwise, add the current number to the set
            visitedNumbers.add(num);
        }

        // If no pair is found, return false
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {8, 7, 2, 5, 3, 1};
        int target = 10;

        // Check if there exists a pair with the given sum
        boolean result = hasPairWithSum(arr, target);

        if (!result) {
            System.out.println("No pair with the given sum was found.");
        }
    }

}
