package com.problemstatement.sortinglargedataefficiently;

public class SortingLargeDataEfficiently {
    public static void bubbleSort(int arr[]){
        int n= arr.length;
        for (int i=0;i< n-1;i++){
            for(int j=0;j< n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void margeSort(int arr[],int st,int end){
        if(st>=end){
            return;
        }
        int mid=st+(end-st)/2;
        margeSort(arr,st,mid);
        margeSort(arr,mid+1,end);
        conquer(arr,st,end,mid);
    }
    private static void conquer(int arr[],int st,int end,int mid){
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


    public static void quickSort(int productPrice[],int low,int high){
        if(low<high){
            int index=partition(productPrice,low,high);
            quickSort(productPrice,low,index-1);
            quickSort(productPrice,index+1,high);
        }

    }
    private static int partition(int productPrice[],int low,int high){
        int pivot=productPrice[high];
        int index=low-1;
        for(int j=low;j<high;j++) {
            if ( productPrice[j]<pivot) {
                index++;
                int temp = productPrice[index];
                productPrice[index] = productPrice[j];
                productPrice[j] = temp;
            }

        }
        index++;
        int temp=productPrice[index];
        productPrice[index]=pivot;
        productPrice[high]=temp;
        return index;



    }



}
