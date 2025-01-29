package com.linkedlist.circularlinkedlist.taskscheduler;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTaskAtEnd("1", "Task A", 1, new Date());
        scheduler.addTaskAtEnd("2", "Task B", 2, new Date());
        scheduler.addTaskAtBeg("3", "Task C", 3, new Date());
        scheduler.addTaskAtPosition("4", "Task D", 4, new Date(), 2);

        System.out.println("All tasks:");
        scheduler.displayAllTasks();

        System.out.println("\nViewing current task and moving to next:");
        scheduler.viewCurrentTaskAndMoveNext();
        scheduler.viewCurrentTaskAndMoveNext();

        System.out.println("\nRemoving task with ID 2");
        scheduler.removeTask("2");
        scheduler.displayAllTasks();

        System.out.println("\nSearching for tasks with priority 3:");
        scheduler.searchTaskByPriority(3);

    }
}
