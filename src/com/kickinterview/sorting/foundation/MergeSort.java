package com.kickinterview.sorting.foundation;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums = new int[]{7,3,1,5,8};
        mergeSort(nums,0,nums.length-1);
        for(int i:nums)
            System.out.println(i);
    }

    private static void mergeSort(int[] nums,int start, int end) {
        if(start>=end)
            return;

        int mid = start+(end-start)/2;
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);

        int i = start;
        int j = mid + 1;
        int []res = new int[end-start+1];
        int indx = 0;

        while (i<=mid && j<=end){
            if(nums[i]<nums[j]){
                res[indx++] = nums[i];
                i++;
            }else{
                res[indx++] = nums[j];
                j++;
            }
        }

        while (i<=mid)
            res[indx++] = nums[i++];

        while (j<=end)
            res[indx++] = nums[j++];

        for(int k=0;k<res.length;k++)
            nums[start++] = res[k];
    }

}
