package com.problem.algorithms.algrithms.anaylze;

/**
 * bitonic search problem
 */
public class BitonicSearch {

    public int find(int[] array, int target) {
        if (array == null || array.length == 0)
            return -1;
        return help(array, target, 0, array.length - 1);
    }

    private int help(int[] array, int target, int lo, int hi) {
        int mid = lo + (hi - lo) / 2;
        if (array[mid] == target)
            return mid;
        if (array[mid] < target){
            if (mid > 0 && array[mid] > array[mid - 1])
                return help(array, target, mid + 1, hi);
            if (mid < array.length - 1 && array[mid] > array[mid+1])
                return help(array, target, lo, mid - 1);
            return -1;
        }else {
            int left = ascendingBinarySearch(array, target, lo, mid - 1);
            int right = dscendingBinarySearch(array, target, mid + 1, hi);
            return left == -1 ? right : left;
        }
    }

    private int ascendingBinarySearch(int[] array, int target, int lo, int hi) {
        if (array == null || array.length == 0)
            return -1;
        if (lo > hi)
            return -1;
        int mid = lo + (hi - lo) / 2;
        if (array[mid] == target)
            return mid;
        if (array[mid] > target)
            return ascendingBinarySearch(array, target, lo, mid - 1);
        else
            return ascendingBinarySearch(array, target, mid + 1, hi);
    }

    private int dscendingBinarySearch(int[] array, int target, int lo, int hi) {
        if (array == null || array.length == 0)
            return -1;
        if (lo > hi)
            return -1;
        int mid = lo + (hi - lo) / 2;
        if (array[mid] == target)
            return mid;
        if (array[mid] > target)
            return dscendingBinarySearch(array, target, mid + 1, hi);
        else
            return dscendingBinarySearch(array, target, lo, mid - 1);
    }


    public static void main(String[] args) {
        BitonicSearch bitonicSearch = new BitonicSearch();
        int array[] = {1, 3, 5, 7, 8, 87, 90, 16, 14, 2};
        int index = bitonicSearch.find(array, 16);
        System.out.println(index);
    }

}
