package com.problem.algorithms.algrithms.sort;

/**
 * Quick Sort
 * Advantage:in-place sort,NlogN
 * Disadvantage:
 * Crux:partitioning process
 */
public class QuickSort {

    /**
     * 1.first, choose a[lo] to be the partitioning item--the one that will go into its final position
     * 2.scan from left end of the array until we find an entry greater than the partitioning item
     * 3.scan from right end of the array until we find an entry smaller than the partitioning item
     * 4.swap the two items.
     * @param a
     * @param lo
     * @param hi
     * @return
     */
    public static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        Comparable s = a[lo];
        while (true) {
            while (SortingUtil.less(a[++i], s)){
                if (i == hi)
                    break;
            }
            while (SortingUtil.less(s, a[--j])){
                if (j == lo)
                    break;
            }
            if (i >= j)
                break;
            SortingUtil.exch(a, i, j);
        }
        SortingUtil.exch(a, lo, j);
        return j;
    }

    public static void quickSort(Comparable[] a) {
        int N = a.length;
        recusiveSort(a, 0, N - 1);
    }

    public static void recusiveSort(Comparable[] a, int lo, int hi) {
        if (hi <= lo)
            return;
        int partition = partition(a, lo, hi);
        recusiveSort(a, lo, partition - 1);
        recusiveSort(a, partition + 1, hi);
    }

    public static void main(String[] args) {
        Integer[] array = {3, 5, 8, 1, 4};
        quickSort(array);
    }


}
