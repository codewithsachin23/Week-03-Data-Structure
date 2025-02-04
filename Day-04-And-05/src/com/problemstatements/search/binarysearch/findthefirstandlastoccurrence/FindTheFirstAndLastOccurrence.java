package com.problemstatements.search.binarysearch.findthefirstandlastoccurrence;

import java.util.Arrays;

public class FindTheFirstAndLastOccurrence {
    public static int[] searchRange(int[] arr, int target) {
        int ans[] = {-1, -1};
        int st = 0;
        int end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                ans[0] = mid;
                end=mid-1;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else end = mid - 1;
        }

        st = 0;
        end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                ans[1] = mid;
                st=mid+1;
            } else if (arr[mid] < target) {
                st= mid + 1;
            } else end = mid - 1;
        }
        return ans;


    }


    public static void main(String[] args) {
        int [] arr={5,7,7,8,8,10};
        int target=7;

        int ans[]=searchRange(arr,target);

        System.out.println(Arrays.toString(ans));

    }
}
