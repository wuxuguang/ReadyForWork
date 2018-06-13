package com.problem.algorithms;

public class Test {

    public int[] findErrorNums(int[] nums) {
        for (int i = 0; i< nums.length; i++) {
            while (nums[i] != i + 1) {
                if (nums[i] == nums[nums[i] - 1])
                    break;
                swap(nums, i, nums[i] - 1);
            }
        }

        for (int i = 0; i< nums.length; i++) {
            if (nums[i] != i + 1)
                return new int[]{nums[i], i+1};
        }

        return null;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        Test test = new Test();
        int[] res = test.findErrorNums(new int[]{2, 3, 2});
        for (int i : res)
            System.out.println(i);
    }

}
