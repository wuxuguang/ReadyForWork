package com.problem.algorithms;

/**
 * Remove Duplicates from Sorted Array
 */
public class Problem26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null)
            return 0;
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] == nums[i + 1])
                res--;
        }
        return res;
    }


    public int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int result = 1;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != temp) {
                temp = nums[i];
                nums[result] = temp;
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Problem26 p = new Problem26();
        int array[] = {1, 2, 3};
        System.out.println(p.removeDuplicates2(array));
    }
}
