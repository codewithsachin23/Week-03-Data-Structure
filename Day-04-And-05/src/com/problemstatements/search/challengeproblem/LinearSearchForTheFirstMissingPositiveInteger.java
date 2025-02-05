package com.problemstatements.search.challengeproblem;

public class LinearSearchForTheFirstMissingPositiveInteger {
    public static int firstMissingPositive(int arr[]){
                int n = arr.length;
                for (int i=0;i<n;i++){
                    if (arr[i]<0||arr[i]>n){
                        arr[i]=0;
                    }
                }

                for (int i=0;i<n;i++){
                    int value=Math.abs(arr[i]);
                    if (value>=1&&value<=n){
                        arr[value-1]=-Math.abs(arr[value-1]);
                    }
                }

              for (int i=0;i<n;i++){
                  if (arr[i]>=0){
                      return i+1;
                  }
              }
              return n+1;
            }

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1,6,8,0,5};
        System.out.println( firstMissingPositive(arr));
    }
}
