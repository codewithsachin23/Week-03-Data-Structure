package com.sorting.insertionsort.sortemployeeids;

public class EmployeeSort {
    public void employeeSort(int employeeID[]){
        int n=employeeID.length;
        boolean alreadySorted = true;
        for(int i=1;i<n;i++){
            int key=employeeID[i];
            int j=i-1;
            if(employeeID[j]>key){
                alreadySorted=false;
            }

            while (j>=0&&employeeID[j]>key){
                employeeID[j+1]=employeeID[j];
                j--;
            }

            employeeID[j+1]=key;
        }
        if (alreadySorted) {
            System.out.println("Already sorted! Runs in O(n)");
        }

    }
}
