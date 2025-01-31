package com.sorting.heapsort.sortjobapplicantsbysalary;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int salaries[] = {45000, 32000, 58000, 39000, 47000, 51000};
        HeapSort heapSorts = new HeapSort();
        heapSorts.heapSort(salaries);
        System.out.println(Arrays.toString(salaries));
    }
}