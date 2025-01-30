package com.problemstatement.hashmapandhashfunction.longestconsecutivesequence;

import java.util.HashMap;

public class LongestConsecutiveSequence {
    // Method to find the length of the longest consecutive sequence

    public static int longestConsecutiveSequence(int nums[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        if (nums.length == 0) return 0;
        int ans=0;
        for(int num:nums){
            if (map.containsKey(num)){
                continue;
            }
            int left = map.getOrDefault(num - 1, 0);
            int right = map.getOrDefault(num + 1, 0);
            int currentStreak = left + right + 1;
            ans = Math.max(ans, currentStreak);
            map.put(num, currentStreak);
            map.put(num - left, currentStreak);
            map.put(num + right, currentStreak);

        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[]={100,4,200,1,3,2};
        int result = longestConsecutiveSequence(arr);

        System.out.println("Length of the longest consecutive sequence: " + result);

    }
}
