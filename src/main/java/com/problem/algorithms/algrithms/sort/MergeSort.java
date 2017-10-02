package com.problem.algorithms.algrithms.sort;

/**
 * Merge Sort
 * Advantage:guarantees to sort an array of N items in time proportional to NlogN
 * Disadvantage:use extra space proportional to N
 */
public class MergeSort {
    /**
     * Merge a[lo..mid] with a[mid+1..hi], use extra space
     * @param a
     * @param lo
     * @param mid
     * @param hi
     */
    public static void merge(Comparable a[], int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        Comparable[] aux = new Comparable[hi - lo + 1];
        for (int k = lo; k <= hi; k++)
            aux[k] = a[k];
        for (int k = lo; k <= hi; k++) {
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (SortingUtil.less(aux[i], aux[j]))
                a[k] = aux[i++];
            else
                a[k] = aux[j++];
        }
    }

    public static void mergeSort(Comparable[] a) {
        int N = a.length;
        recusiveSort(a, 0, N - 1);
    }

    public static void recusiveSort(Comparable a[], int lo, int hi) {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        recusiveSort(a, lo, mid);
        recusiveSort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }
}
