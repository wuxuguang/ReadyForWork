package com.problem.algorithms.algrithms.anaylze;

import java.util.Arrays;

/**
 * 3-sum problem
 */
public class ThreeSum {

    public int getCount(int[] a, int target) {
        if (a == null || a.length < 3)
            return -1;
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int j = i + 1, k = a.length - 1;
            while (j < k) {
                if (a[j] + a[k] > target - a[i])
                    k--;
                else if (a[j] + a[k] < target - a[i])
                    j++;
                else{
                    count++;
                    j++;
                }
            }
        }
        return count;
    }

}
