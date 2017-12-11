package com.problem.algorithms;

public class Problem35 {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length;
        while (low < high) {
            int mid = low + ((high - low) >> 1);
            //low <= mid < high
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                //should not be mid-1 when A[mid]==target.
                //could be mid even if A[mid]>target because mid<high.
                high = mid;
            }
        }
        return low;
    }


    public static void main(String[] args) {
        Problem35 p = new Problem35();
        int[] nums = {1, 3, 5, 6};
        System.out.println(p.searchInsert(nums, 7));
    }
}
