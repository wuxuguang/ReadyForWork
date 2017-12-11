package com.problem.algorithms;

public class Problem34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return new int[]{-1, -1};
        int lo = 0, hi = nums.length - 1;
        int min = -1, max = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (target < nums[mid])
                hi = mid - 1;
            else if (target > nums[mid])
                lo = mid + 1;
            else {
                min = mid;
                max = mid;
                while (min >= 0 && nums[min--] == target) {}
                while (max < nums.length && nums[max++] == target){}
                break;
            }
        }
        if (min > 0 || max > 0)
            return new int[]{min + 1, max -1};
        else
            return new int[]{min, max};
    }


    //find the first number that is greater than or equal to target.
    //could return A.length if target is greater than A[A.length-1].
    //actually this is the same as lower_bound in C++ STL.
    public static int firstGreaterEqual(int[] A, int target) {
        int low = 0, high = A.length;
        while (low < high) {
            int mid = low + ((high - low) >> 1);
            //low <= mid < high
            if (A[mid] < target) {
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
        Problem34 p = new Problem34();
        int a[] = new int[]{5, 7, 7, 8, 8, 10};

        System.out.println(Problem34.firstGreaterEqual(a, 11));

     /*   int[] indexes = p.searchRange(a, 8);
        for (int i = 0; i < indexes.length; i++) {
            System.out.println(indexes[i]);
        }*/
    }
}
