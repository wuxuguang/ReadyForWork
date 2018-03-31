package com.problem.algorithms.leetcode.binarysearch;

public class Problem69 {
    public int mySqrt(int x) {
        if (x < 0)
            throw new IllegalArgumentException("your input is not negative");
        if (x == 0)
            return 0;
        int left = 1, right = Integer.MAX_VALUE;
        while (true) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }
}
