package com.sorting.insertionsort.sortemployeeids;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int employeeID[]={4,6,8,2,7,1,3};
        EmployeeSort es=new EmployeeSort();
        es.employeeSort(employeeID);
        System.out.println(Arrays.toString(employeeID));
    }
}
