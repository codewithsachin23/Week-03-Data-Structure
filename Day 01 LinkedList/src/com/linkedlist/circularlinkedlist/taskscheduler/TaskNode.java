package com.linkedlist.circularlinkedlist.taskscheduler;

import java.util.Date;

public class TaskNode {

        String taskID;
        String taskName;
        int priority;
        Date dueDate;
        TaskNode next;

        public TaskNode(String taskID, String taskName, int priority, Date dueDate) {
            this.taskID = taskID;
            this.taskName = taskName;
            this.priority = priority;
            this.dueDate = dueDate;
            this.next = null;
        }
}
