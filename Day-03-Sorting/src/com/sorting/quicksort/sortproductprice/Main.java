package com.sorting.quicksort.sortproductprice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[]={6,2,4,5,1,9,8,7,3};
        int n= arr.length;
        ProductPriceSort productPriceSort=new ProductPriceSort();
        productPriceSort.quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
