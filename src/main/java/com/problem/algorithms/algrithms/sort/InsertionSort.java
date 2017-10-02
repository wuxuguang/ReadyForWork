package com.problem.algorithms.algrithms.sort;

/**
 * InsertionSort
 */
public class InsertionSort {
    public static void insertionSort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 &&  SortingUtil.less(a[j], a[j-1]); j--)
                SortingUtil.exch(a, j, j-1);
        }
    }
}
