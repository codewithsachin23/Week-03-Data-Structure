package com.problemstatement.stack.implementaqueueusingstacks;

public class Main {
    public static void main(String[] args) {
        QueueUsingStack queue=new QueueUsingStack();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        queue.printQueue();
        System.out.println();


        System.out.println("Element poll");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());



        System.out.println("Peek element in queue: "+queue.peek());



        System.out.println("After poll the element from queue");
        queue.printQueue();






    }
}
