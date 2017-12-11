package com.problem.algorithms;

public class Problem30 {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length < 1)
            return;
        int index = nums.length - 1;
        while (index > 0) {
            if (nums[index] > nums[index - 1])
                break;
            index--;
        }
        // 处理边界条件
        if (index == 0){
            reverseSort(nums,0,index);
        }else {
            int val=nums[index-1];
            int j=nums.length - 1;
            while(j>=index){
                if(nums[j]>val)
                    break;
                j--;
            }
            swap(nums,j,index-1);
            reverseSort(nums,index,nums.length-1);
            return;
        }



    }

    private void reverseSort(int[] num, int start, int end){
        if(start>end)
            return;
        for(int i=start;i<=(end+start)/2;i++)
            swap(num,i,start+end-i);
    }

    public void swap(int[] num, int i, int j){
        int temp=0;
        temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }


    public static void main(String[] args) {

    }

}
