package com.problem.algorithms;

/**
 * Shortest Unsorted Continuous Subarray
 */
public class Problme581 {

    /**
     * 这种方法的思想在于，在所要找出的子数组中，最小值确定了这个子数组的左边界，最大值确定了这个子数组的右边界。
     * @param nums
     * @return
     */
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1])
                flag = true;
            if (flag)
                min = Math.min(min, nums[i]);
        }
        flag = false;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1])
                flag = true;
            if (flag)
                max = Math.max(max, nums[i]);
        }
        int l, r;
        for (l = 0; l < nums.length; l++) {
            if (min < nums[l])
                break;
        }
        for (r = nums.length - 1; r >= 0; r--) {
            if (max > nums[r])
                break;
        }
        return r - l < 0 ? 0 : r - l + 1;
    }


    public static void main(String[] args) {
        Problme581 p = new Problme581();
        int[] array = {1, 3, 2, 2, 2};
        p.findUnsortedSubarray(array);
    }
}
