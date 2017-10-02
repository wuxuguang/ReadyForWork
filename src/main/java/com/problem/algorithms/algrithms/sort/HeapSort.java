package com.problem.algorithms.algrithms.sort;

/**
 * Created by wuxuguang on 2017/5/9.
 */
public class HeapSort {
    public static void swim(Comparable[] a, int k) {
        while (k > 1 && SortingUtil.less(a[k/2] , a[k])) {
            SortingUtil.exch(a, k / 2, k);
            k = k/2;
        }
    }

    public static void sink(Comparable[] a, int k) {
        int N = a.length - 1;
        while (2 * k <= N) {  //只要有一个子节点没有超过N（数组长度为N+1，a[0]留空）
            int j = 2 * k;
            if (j < N && SortingUtil.less(a[j], a[j+1])) // 说明j2k+1子节点没有越界
                j++;
            if (SortingUtil.less(a[k], a[j]))
                SortingUtil.exch(a, k, j);
            k = j;

        }
    }
}
