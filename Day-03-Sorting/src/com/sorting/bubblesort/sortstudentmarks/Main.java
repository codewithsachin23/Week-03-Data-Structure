package com.sorting.bubblesort.sortstudentmarks;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[]={94,64,45,33,75};
        SortStudentMarks sort=new SortStudentMarks();
        sort.studentMarks(arr);
        System.out.println(Arrays.toString(arr));
    }
}
