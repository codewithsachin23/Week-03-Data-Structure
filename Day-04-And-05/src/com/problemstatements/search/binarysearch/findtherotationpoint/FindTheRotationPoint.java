package com.problemstatements.search.binarysearch.findtherotationpoint;

public class FindTheRotationPoint {
    public static int findRotationPoint(int[] arr) {
        int st=0;
        int end= arr.length-1;
        if(arr[st]<arr[end]){
            return 0;
        }
        while (st<end){
            int mid = (st + end) / 2;
            if(arr[mid]>arr[end]){
                st=mid+1;
            }else {
                end=mid;
            }
        }
        return st;

    }
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        int rotationPoint = findRotationPoint(arr);
        System.out.println("Rotation Point is at index: " + rotationPoint);
    }
}
