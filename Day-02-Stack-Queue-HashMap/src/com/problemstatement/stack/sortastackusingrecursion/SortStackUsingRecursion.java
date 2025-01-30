package com.problemstatement.stack.sortastackusingrecursion;

import java.util.Stack;

public class SortStackUsingRecursion {
public void sortStack(Stack<Integer>stack){
    if(!stack.isEmpty()){
        int temp=stack.pop();
        sortStack(stack);
        insertSorted(stack, temp);
    }
}
    private static void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
        } else {
            int temp = stack.pop();
            insertSorted(stack, element);
            stack.push(temp);
        }
    }

    public void display(Stack<Integer>stack){

    for(int i=stack.size()-1;i>=0;i--){
        System.out.print(stack.get(i)+" ");
    }
        System.out.println();

    }
}
