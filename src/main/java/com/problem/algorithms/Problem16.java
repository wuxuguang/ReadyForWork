package com.problem.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 3Sum Closest
 */
public class Problem16 {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3)
            return Integer.MAX_VALUE;
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int lo = i + 1, hi = nums.length - 1;
                while (lo < hi) {
                    int gap = nums[i] + nums[lo] + nums[hi] - target;
                    if (Math.abs(gap) < res){
                        res = Math.abs(gap);
                        r = nums[i] + nums[lo] + nums[hi];
                    }
                    if (gap == 0)
                        return nums[i] + nums[lo] + nums[hi];
                    else if (gap > 0){
                        hi--;
                    }else
                        lo++;

                }
            }
        }
        return r;
    }


    public static void main(String[] args) {
        Problem16 p = new Problem16();
        int[] array = {0, 1, 2};
        p.threeSumClosest(array, 0);
    }

}
