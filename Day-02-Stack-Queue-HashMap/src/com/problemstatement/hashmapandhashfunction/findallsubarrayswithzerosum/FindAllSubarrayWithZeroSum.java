package com.problemstatement.hashmapandhashfunction.findallsubarrayswithzerosum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllSubarrayWithZeroSum {
    public static List<List<Integer>>subArray(int arr[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        List<List<Integer>> ans=new ArrayList<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                List<Integer>subArray=new ArrayList<>();
                for(int j=0;j<=i;j++){
                    subArray.add(arr[j]);
                }
                ans.add(subArray);
            }

            if (map.containsKey(sum)) {
                int prev=map.get(sum);
                List<Integer>subArray=new ArrayList<>();
                for(int j=prev+1;j<=i;j++){
                    subArray.add(arr[j]);
                }
                ans.add(subArray);
            }
            map.put(sum,i);
        }
        return ans;

    }
    public static void display(List<List<Integer>> subarrays) {
        if (subarrays.isEmpty()) {
            System.out.println("No zero-sum subarrays found.");
        } else {
            for (List<Integer> subarray : subarrays) {
                System.out.println(subarray);
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};

        List<List<Integer>>ans=subArray(arr);
        display(ans);


    }
}
