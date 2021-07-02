package com.kickinterview.sorting.foundation;

//Get the smallest element in each iteration and set it at index by swapping
public class SelectionSort {

    /**
     * function selectionsort(A): //array A[1..n]
     * for i in 1 to n:
     * #Find the i th smallest element and swap it
     * with A[i]
     * min = i
     * During a linear scan of A[i..n]:
     * if you find a smaller element than
     * A[min]:
     * Update the index of the min
     * element
     * Swap the min element with A[i]
     */
    public static void main(String[] args) {
        int[] nums = new int[]{7,3,1,5,8};
        selectionSort(nums);
        for(int i:nums)
            System.out.println(i);
    }

    private static void selectionSort(int[] nums) {
        int min;
        int len = nums.length;
        for(int i=0;i<len;i++){
            min = i;
            for(int j=i+1;j<len;j++)
                if(nums[j]<nums[min])
                    min = j;

            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }

}
