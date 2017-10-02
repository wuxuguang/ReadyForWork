package com.problem.algorithms;

public class Problem27 {
    public int removeElement(int[] nums, int val) {
        int begin = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[begin++] = nums[i];
        }
        return begin;
    }

    public static void main(String[] args) {
        Problem27 p = new Problem27();
        int[] nums = {3, 2, 2, 3};
        System.out.println(p.removeElement(nums, 3));
    }
}
