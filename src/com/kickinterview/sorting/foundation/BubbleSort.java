package com.kickinterview.sorting.foundation;

/**
 * we could have scanned the array from right to left, and bubbled up the minimum to the left by repeated exchanges.
 *
 * Repeat n times:
 * While scanning the array from right to left:
 *      if A[i-1] > A[i], swap them
 *
 *
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = new int[]{7,3,1,5,8};
        bubbleSort(nums);
        for(int i:nums)
            System.out.println(i);
    }

    private static void bubbleSort(int[] nums) {
        int len = nums.length;

        for(int i=0;i<len;i++)
            for(int j=len-1;j>0;j--)
                if(nums[j]<nums[j-1]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
    }
}
