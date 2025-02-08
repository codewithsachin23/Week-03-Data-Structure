package com.problemstatement.searchtargetinlargedataset;

public class SearchingComparison {
        // Linear Search
        public static int linearSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    // Return index if found
                    return i;
                }
            }
            // Return -1 if not found
            return -1;
        }

        // Binary Search
        public static int binarySearch(int[] arr, int target) {
            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == target) {
                    // Return index if found
                    return mid;
                } else if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            // Return -1 if not found
            return -1;
        }
}
