package com.problem.algorithms.algrithms.search;

import java.util.Comparator;

/**
 * Binary Search
 */
public class BinarySearch {

    /**
     * 找出数组a中为key值的下标
     * @param a 要查找的排序数组
     * @param n 要查找的数组中下标最大的
     * @param key 需要查找的值
     * @return
     */
    public static int binarySearch(int[] a, int n, int key) {
        int low = 0, high = n;
        while (low <= high){    //此处必须要加等号，因为实际上二分查找是一个不断排除的过程，有可能会排除到左边的index和右边的index都相等
            int mid  = low + (high - low) /2;
            if (a[mid] > key)
                high = mid - 1;
            else if(a[mid] < key)
                low = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    /**
     * 查找第一个大于某个数的下标
     * @param a
     * @param n
     * @param key
     * @return
     */
    public static int firstGreatOrEqual(int[] a, int n, int key) {
        int low = 0, high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] > key)
                high = mid - 1;
            else if(a[mid] < key)
                low = mid + 1;
            else
                return mid + 1;
        }
        if (low > n)
            return -1;
        return low;
    }

        public static void main(String[] args) {
        int a[] = {1, 3, 5, 8, 10};
        int key = 8;
        System.out.println(binarySearch(a, a.length - 1, key));
    }

}
