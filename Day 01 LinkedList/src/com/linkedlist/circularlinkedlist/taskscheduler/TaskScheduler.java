package com.linkedlist.circularlinkedlist.taskscheduler;

import java.util.Date;

public class TaskScheduler {
    private TaskNode head = null, tail = null, currentTask = null;
    public void addTaskAtBeg(String taskID, String taskName, int priority, Date dueDate) {
        TaskNode newNode = new TaskNode(taskID, taskName, priority, dueDate);
        if (head==null){
            head=tail=newNode;
            tail.next=head;
        }else {
            newNode.next=head;
            head=newNode;
            tail.next=head;
        }

    }
    public void addTaskAtEnd(String taskID, String taskName, int priority, Date dueDate) {
        TaskNode newNode = new TaskNode(taskID, taskName, priority, dueDate);
        if(head==null){
            head=tail=newNode;
            tail.next=head;
        }else {
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }

    }
    public void addTaskAtPosition(String taskID, String taskName, int priority, Date dueDate, int position) {
        if(position==0){
            addTaskAtBeg(taskID, taskName, priority, dueDate);
            return;
        }
        TaskNode newNode = new TaskNode(taskID, taskName, priority, dueDate);
        TaskNode current=head;
        for (int i = 0; i < position - 1 && current.next != head; i++) {
            current = current.next;
        }
        newNode.next=current.next;
        current.next=newNode;
        if (current == tail) {
            tail = newNode;
        }
    }
    public void removeTask(String taskID) {
        if (head == null) return;
        TaskNode current = head, prev = null;
        while (true) {
            if (current.taskID.equals(taskID)) {
                if (current == head) {
                    if (head == tail) {
                        head = tail = null;

                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }
                return;

            }
            prev = current;
            current = current.next;
            if (current == head) {
                break;
            }
        }
    }
    public void viewCurrentTaskAndMoveNext() {
        if (currentTask == null) currentTask = head;
        if (currentTask != null) {
            System.out.println("Current Task: " + currentTask.taskName);
            currentTask = currentTask.next;
        }
    }

    public void displayAllTasks() {
        if (head == null) return;
        TaskNode current = head;
        do {
            System.out.println("Task ID: " + current.taskID);
            System.out.println("Task Name: " + current.taskName);
            System.out.println("Priority: " + current.priority);
            System.out.println("Due Date: " + current.dueDate);
            System.out.println("--------------------");
            current = current.next;
        } while (current != head);
    }

    public void searchTaskByPriority(int priority) {
        if (head == null) return;
        TaskNode current = head;
        do {
            if (current.priority == priority) {
                System.out.println("Found Task: " + current.taskName);
                return;
            }
            current = current.next;
        } while (current != head);
        System.out.println("No task found with priority " + priority);
    }


    }
