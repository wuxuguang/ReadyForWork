package com.problem.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 4sum
 */
public class Problem18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4)
            return Collections.emptyList();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                for (int j = i + 1; j < nums.length - 2; j++) {
                    int lo = j + 1, hi = nums.length - 1, sum = target - nums[i] - nums[j];
                    while (lo < hi) {
                        if (nums[lo] + nums[hi] == sum) {
                            res.add(Arrays.asList(new Integer[]{nums[i], nums[j], nums[lo], nums[hi]}));
                            while (lo < hi && nums[lo] == nums[lo + 1])
                                lo++;
                            while (lo < hi && nums[hi] == nums[hi - 1])
                                hi--;
                            lo++;
                            hi--;
                        }else if (nums[lo] + nums[hi] > sum)
                            hi--;
                        else
                            lo++;
                    }
                    while (j < nums.length - 3 && nums[j] == nums[j+1])
                        j++;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Problem18 p = new Problem18();
        int[] array = {0,0,4,-2,-3,-2,-2,-3};
        List<List<Integer>> res = p.fourSum(array, -1);
        for (List<Integer> list : res) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
