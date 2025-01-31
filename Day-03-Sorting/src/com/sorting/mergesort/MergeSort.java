package com.sorting.mergesort;

public class MergeSort {
    public void divide(int arr[],int st,int end){
        if(st>=end){
            return;
        }
        int mid=st+(end-st)/2;
        divide(arr,st,mid);
        divide(arr,mid+1,end);
        conquer(arr,st,end,mid);
    }
    public void conquer(int arr[],int st,int end,int mid){
        int tmepArray[]=new int[end-st+1];
        int index1=st;
        int index2=mid+1;
        int ind=0;

        while (index1 <= mid && index2 <= end) {
            if (arr[index1] <= arr[index2]) {
                tmepArray[ind++] = arr[index1++];
            } else {
                tmepArray[ind++] = arr[index2++];
            }
        }

        while (index1 <= mid) {
            tmepArray[ind++] = arr[index1++];
        }

        while (index2 <= end) {
            tmepArray[ind++] = arr[index2++];
        }
        for (int i = 0; i < tmepArray.length; i++) {
            arr[st + i] = tmepArray[i];
        }


    }
}
