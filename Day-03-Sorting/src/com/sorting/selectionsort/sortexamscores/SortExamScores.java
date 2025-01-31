package com.sorting.selectionsort.sortexamscores;

public class SortExamScores {
    public void sortMarks(int marks[]){
        int n=marks.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for (int j=i+1;j<n;j++){
                if(marks[j]<marks[min]){
                    min=j;
                }
            }
            int temp=marks[i];
            marks[i]=marks[min];
            marks[min]=temp;
        }

    }
}
