package com.problem.algorithms;

import java.util.*;

public class Problem15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3)
            return Collections.emptyList();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum){
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo+1])
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
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 2};
        Arrays.sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

}
