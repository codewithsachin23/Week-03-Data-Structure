package com.sorting.mergesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {5, 6, 4, 7, 2, 8, 1, 3, 9};
        int st=0;
        int end= arr.length-1;
        MergeSort ms=new MergeSort();
        ms.divide(arr,st,end);
        System.out.println(Arrays.toString(arr));
    }
}
