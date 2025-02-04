package com.problemstatements.search.challengeproblem;

public class BinarySearchForTheTargetIndex {
    public static int searchTarget(int arr[], int target){
        int st=0;
        int end=arr.length-1;
        while (st<end){
            int mid=st+(end-st)/2;

            if (arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else {
                st=mid+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,54,65,74,83,90,91,96,99};
        int target=74;
        System.out.println(searchTarget(arr,target));
    }
}
