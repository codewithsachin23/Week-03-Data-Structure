package com.problemstatement.queue.circulartourproblem;



public class Main {
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        CircularTourProblem cp=new CircularTourProblem();
        int start = cp.findStartingPoint(petrol, distance);

        // Display the result
       cp.displayResult(start);
    }
}
