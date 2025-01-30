package com.problemstatement.hashmapandhashfunction.twosumproblem;

import java.util.HashMap;

public class TwoSumProblem {
    public static int [] twoSum(int arr[],int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            int req=target-arr[i];
            if(map.containsKey(req)){
                int []ans={map.get(req),i};
                return ans;
            }
            map.put(arr[i],i);
        }
return null;
    }

    public static void display(int ans[]){
          for(int a:ans){
              System.out.print(a+" ");
          }
    }
    public static void main(String[] args) {
        int number[]={2,7,11,15};
        int target=9;

        int []ans=twoSum(number,target);
        display(ans);

    }
}
