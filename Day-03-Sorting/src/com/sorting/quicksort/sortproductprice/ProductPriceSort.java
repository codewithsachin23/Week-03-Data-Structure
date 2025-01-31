package com.sorting.quicksort.sortproductprice;

public class ProductPriceSort {
    public int partition(int productPrice[],int low,int high){
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

    public void quickSort(int productPrice[],int low,int high){
        if(low<high){
            int index=partition(productPrice,low,high);
            quickSort(productPrice,low,index-1);
            quickSort(productPrice,index+1,high);
        }

    }

}
