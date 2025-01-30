package com.problemstatement.stack.implementaqueueusingstacks;

import java.util.Stack;
public class QueueUsingStack{
    private Stack<Integer> stack1 ;
    private Stack<Integer> stack2 ;
    private int size;


    public  QueueUsingStack(){
        this.stack1=new Stack<>();
        this.stack2=new Stack<>();
        this.size=0;
    }

//check empty
    public boolean isEmpty() {
        return size == 0;
    }
    //insert element in queue using stack
    public void enqueue(int element){
        stack1.push(element);
        size++;
    }
    //delete element in queue using stack
    public int dequeue(){
        if(stack1.isEmpty()){
            System.out.println("stack is empty");
            return 0;
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int front=stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        size--;
        return front;
    }
    //peek  element in queue
    public int peek(){
        if(stack1.isEmpty()){
            System.out.println("stack is empty");
            return 0;
        }

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int peek=stack2.peek();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return peek;
    }

    //size of queue
    public int size(){
        return size;
    }

    public void printQueue(){
        if(stack1.isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        while (!stack2.isEmpty()){
            int el=stack1.push(stack2.pop());
            System.out.print(el+" ");

        }

    }
}
