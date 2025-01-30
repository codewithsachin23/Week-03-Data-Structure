package com.problemstatement.queue.circulartourproblem;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTourProblem {

    public static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        Queue<Integer> queue = new LinkedList<>();
        int totalPetrol = 0;
        int totalDistance = 0;
        int currentPetrol = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            totalPetrol+=petrol[i];
            totalDistance+=distance[i];
            currentPetrol+=petrol[i]-distance[i];

            queue.offer(i);

            while (currentPetrol<0&&!queue.isEmpty()){
                int temp=queue.poll();
                currentPetrol-=(petrol[temp]-distance[temp]);
                start=temp+1;
            }
        }
        return (totalPetrol >= totalDistance) ? start : -1;


    }
    // Function to display the result
    public static void displayResult(int start) {
        if (start == -1) {
            System.out.println("It's not possible to complete the circular tour.");
        } else {
            System.out.println("The starting point for completing the circular tour is pump index: " + start);
        }
    }
}
