package com.problem.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Find All Numbers Disappeared in an Array
 */
public class Problem448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != (i + 1) && nums[i] != nums[nums[i] -1]){
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[temp - 1] = temp;
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != (i + 1))
                res.add(i+1);
        }
        return res;
    }

    public static void main(String[] args) {
        Problem448 p = new Problem448();
        int[] array = {4,3,2,7,8,2,3,1};
        List<Integer> res = p.findDisappearedNumbers(array);
        System.out.println(res.size());
    }
}
