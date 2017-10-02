package com.problem.algorithms.algrithms.sort;

/**
 * Created by wuxuguang on 2017/5/7.
 */
public class SortingUtil {
    public static void sort(Comparable[] a){
        SelectionSort.selectionSort(a);
    }

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static void exch(Comparable a, Comparable b) {
        Comparable temp = a;
        a = b;
        b = temp;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void show(Comparable[] a){
        for (int i=0; i < a.length; i++)
            System.out.println(a[i]);
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (!less(a[i], a[i+1]))
                return false;
        }
        return true;
    }


    public static void main(String[] args) {

    }
}
