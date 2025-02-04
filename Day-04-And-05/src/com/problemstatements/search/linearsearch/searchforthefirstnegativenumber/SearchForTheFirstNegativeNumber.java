package com.problemstatements.search.linearsearch.searchforthefirstnegativenumber;

public class SearchForTheFirstNegativeNumber {
    public static int firstNegativeNumber(int arr[]){
        int n=arr.length;
        for (int i=0;i<n;i++){
            if(arr[i]<0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,5,2,5,2,4,9,0};
        System.out.println(firstNegativeNumber(arr));

    }
}
