package com.problemstatement.stack.sortastackusingrecursion;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(3);
        stack.push(4);
        stack.push(2);

        SortStackUsingRecursion st=new SortStackUsingRecursion();
        System.out.println("Before");
        st.display(stack);

        st.sortStack(stack);
        System.out.println("After sort");

        st.display(stack);





    }

}
