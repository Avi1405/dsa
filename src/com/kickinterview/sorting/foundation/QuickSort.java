package com.kickinterview.sorting.foundation;

import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = new int[]{7,3,1,5,8};
        quickSort(nums);
        for(int i:nums)
            System.out.println(i);
    }

    public static void quickSort(int []nums){
        quickSortHelper(nums,0,nums.length-1);
    }

    private static void quickSortHelper(int[] nums, int start, int end) {
        if(start>=end)
            return;

        Random rand = new Random();
        int rIndx  = rand.nextInt(end-start)+start;
        swap(nums,start,rIndx);

        int pivot = nums[start];
        int bigger;
        int smaller = start;

        for(bigger=start+1;bigger<=end;bigger++){
            if(nums[bigger]<pivot){
                smaller++;
                swap(nums,bigger,smaller);
            }
        }

        swap(nums,start,smaller);

        quickSortHelper(nums,start,smaller-1);
        quickSortHelper(nums,smaller+1,end);
    }

    private static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

}
