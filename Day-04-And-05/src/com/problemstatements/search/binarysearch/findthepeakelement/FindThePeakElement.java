package com.problemstatements.search.binarysearch.findthepeakelement;

public class FindThePeakElement {
    public static int peekElement(int arr[]){
        int left=0;
        int right=arr.length;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            if (arr[mid]>=arr[mid-1]){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 1, 0};
        int peak = peekElement(arr);
        System.out.println("Peak element is: " + peak);
    }
}
