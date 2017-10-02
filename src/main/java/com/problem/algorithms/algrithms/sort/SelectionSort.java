package com.problem.algorithms.algrithms.sort;

/**
 * Selection Sort
 */
public class SelectionSort {
    public static void selectionSort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (SortingUtil.less(a[j], a[min]))
                    min = j;
            }
            SortingUtil.exch(a, i, min);
        }
    }

}
