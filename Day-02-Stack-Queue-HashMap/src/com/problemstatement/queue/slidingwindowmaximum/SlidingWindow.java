package com.problemstatement.queue.slidingwindowmaximum;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {
   public int []calculateMaximum(int nums[],int k){
       if(nums.length==0){
           return  new int[0];
       }
       int n=nums.length;
       int max[]=new int[n - k + 1];
       Deque<Integer>deque=new LinkedList<>();

       for(int i=0;i<n;i++){
           if (!deque.isEmpty()&&deque.peekFirst()<=i-k+1){
               deque.pollFirst();
           }
           while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
               deque.pollLast();
           }
           deque.offerLast(i);

           if(i>=k-1){
               max[i-k+1]=nums[deque.peekFirst()];
           }
       }
       return max;
   }
   public void display(int []ans){
       for(int a:ans){
           System.out.print(a+" ");
       }
   }

}
