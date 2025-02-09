package com.problemstatement.comparingdifferentdatastructuresforsearching;

import java.util.HashSet;
import java.util.TreeSet;

public class SearchComparisonUsingSet {
    //method to search element at hashset with time
    public static boolean searchHashSet(HashSet<Integer> hashSet, int key) {
        //store true if hashset contains the element
        return  hashSet.contains(key);
    }

    public static boolean searchArray(int[] array, int key) {
        //Method to time comparison at linear search
        long startTime = System.currentTimeMillis();
        for (int num : array) {
            if (num == key) {
                return true;
            }
        }
        return false;
    }

    public static boolean searchTreeSet(TreeSet<Integer> treeSet, int key) {
        return treeSet.contains(key);
    }

}
