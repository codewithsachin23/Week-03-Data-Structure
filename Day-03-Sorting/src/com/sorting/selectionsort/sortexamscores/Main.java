package com.sorting.selectionsort.sortexamscores;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortExamScores mark=new SortExamScores();
        int marks[]={90,67,82,79,45};
        mark.sortMarks(marks);
        System.out.println(Arrays.toString(marks));


    }
}
