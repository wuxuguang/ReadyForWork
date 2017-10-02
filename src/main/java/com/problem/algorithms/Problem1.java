package com.problem.algorithms;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {

    /**
     * 假设存在i和j满足 nums[i] + nums[j] == target
     * 也就是说对于 nums[i], target-nums[i]一定存在于这个数组中
     *
     * 假设有一个新的数组help[i] = target - nums[i]
     *
     * 那么问题就转化为  nums[i] = help[j]，找出i,j就是答案。此问题似乎不是很好解决，换思路。
     *
     *
     * 用一个数组hash[]
     */

    public static int[] twoSum(int[] numbers, int target) {
        if(numbers.length < 2)
            return null;
        int result[] = new int[2];

        /**
         * 用一个map来做辅助的map，key是numbers[i]，value是i
         */
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i =0 ;i < numbers.length; i++){
            Integer n = map.get(numbers[i]);
            if(n == null)
                map.put(numbers[i], i);
            n = map.get(target - numbers[i]);
            if(n!= null && n<i){
                result[0] = n+1;
                result[1] = i+1;
            }
        }
        return result;
    }


    public int[] twoSum2(int[] nums, int target) {
        int result[] = new int[2];
        if(nums == null || nums.length <2)
            return result;
        int length = nums.length;
        int start = 0, end;
        while(start < length - 1){
            end  = start + 1;
            while(end < length){
                if(nums[start] + nums[end] == target){
                    result[0] = start + 1;
                    result[1] = end +1;
                    return result;
                }
                end++;
            }
            start++;
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15}, target = 9;
        int[] result = twoSum(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }







}
