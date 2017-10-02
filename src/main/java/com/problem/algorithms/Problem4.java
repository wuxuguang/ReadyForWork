package com.problem.algorithms;

/**
 * Median of Two Sorted Arrays
 * 1. 首先需要理解Median的含义，在一个数组中，需要找出一个数，这个数可以将这个数组分成两部分，使得左部分和右部分的size一致且左部分的最大值小于右部分的最小值
 */
public class Problem4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null)
            nums1 = new int[0];
        if (nums2 == null)
            nums2 = new int[0];
        int m = nums1.length, n = nums2.length;
        if (m > n)
            return findMedianSortedArrays(nums2, nums1);
        if (n == 0)
            throw new IllegalArgumentException("your input is not right");

        int min = 0, max = m, halfLen = (m + n + 1) / 2;
        int i, j, maxLeft, minRight;
        while (min <= max) {
            i = min + (max - min) / 2;
            /**
             * 1. 若m+n为奇数，则满足 i = (m + n + 1) / 2 - j, 也即 2i = m + n + 1 - 2j
             */
            j = halfLen - i;

            if (i < m && nums2[j - 1] > nums1[i])
                min = i + 1;
            else if (i > 0 && nums2[j] < nums1[i - 1])
                max = i - 1;
            else {
                if (i == 0)
                    maxLeft = nums2[j - 1];
                else if (j == 0)
                    maxLeft = nums1[i - 1];
                else
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);

                if ((m + n) % 2 == 1)
                    return maxLeft;

                if (i == m)
                    minRight = nums2[j];
                else if (j == n)
                    minRight = nums1[i];
                else
                    minRight = Math.min(nums1[i], nums2[j]);

                return (Double.valueOf(maxLeft + minRight)) / 2;
            }
        }

        throw new IllegalArgumentException("your input is not right");
    }


    public static void main(String[] args) {
        Problem4 p = new Problem4();
        int[] num1 = {3, 4};
        int[] num2 = {1, 2};
        System.out.println(p.findMedianSortedArrays(num1, num2));
    }

}
