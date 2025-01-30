package com.problemstatement.stack.stockspanproblem;

import java.util.Stack;

public class StockSpanProblem {
public int[] calculateSpan(int price[]){
    int [] span=new int[price.length];
    Stack<Integer> stack=new Stack<>();
    for(int i=0;i< price.length;i++){
        while (!stack.isEmpty()&&price[stack.peek()]<=price[i]){
            stack.pop();
        }

        span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

        stack.push(i);
    }



    return span;
}
    public void display(int[] span) {
        for (int s : span) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
