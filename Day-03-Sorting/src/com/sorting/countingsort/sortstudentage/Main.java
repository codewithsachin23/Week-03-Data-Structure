package com.sorting.countingsort.sortstudentage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CountingSort cs=new CountingSort();
        int ages[] = {12, 15, 10, 18, 14, 16, 11, 12, 17, 13};

        cs.countingSort(ages, 10, 18);
        System.out.println(Arrays.toString(ages));
    }
}
