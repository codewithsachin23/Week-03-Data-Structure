package com.problemstatement.queue.slidingwindowmaximum;

public class Main {
    public static void main(String[] args) {
        int nums[] = {1,3,-1,-3,5,3,6,7};
        int k=3;

        SlidingWindow sw=new SlidingWindow();
        int max[]=sw.calculateMaximum(nums,k);
        sw.display(max);


    }
}
