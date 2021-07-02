package com.kickinterview.sorting.foundation;

/**
 * Decrease and Conquer
 *
 *
 * Decrease the problem of size n to size n-1
 * - Assume you have solved the problem of size n-1
 * - Solve the problem of size n using the solution to the problem of size n-1
 *
 * Arranging cards -  number at right place in each iteration
 *
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = new int[]{7,3,1,5,8};
        insertionSortRecursive(nums,nums.length-1);
        for(int i:nums)
            System.out.println(i);

        System.out.println("==========Iterative============");
        nums = new int[]{7,3,1,5,8};
        insertionSortIterative(nums);
        for(int i:nums)
            System.out.println(i);
    }

    /**
     * def insertionsort(A,n): //array A[1..n]
     *  if (n <= 1) return;
     *      insertionsort(A,n-1);
     * //now insert the nth element into its place.
     *      nth = A[n]
     *      j = n-1
     *      while j >= 1 and A[j] > nth:
     *          A[j+1] = A[j]
     *          j = j - 1
     *      A[j+1] = nth
     */
    private static void insertionSortRecursive(int[] nums,int n) {

        if(n<=1)
            return;
        insertionSortRecursive(nums,n-1);

        int nth = nums[n];
        int j = n-1;
        while (j>=1 && nums[j]>nth)
        {
            nums[j+1] = nums[j];
            j--;
        }

        nums[j+1] = nth;
    }

    /**
     * def insertionsort(A): //array A[1..n]
     * if (n <= 1) return;
     * for i = 2 to n:
     *  ith = A[i]
     *  j = i-1
     *  while j >= 1 and A[j] > ith:
     *      A[j+1] = A[j]
     *      j = j - 1
     *  A[j+1] = ith
     */
    private static void insertionSortIterative(int[] nums) {
        if(nums.length<1)
            return;

        for(int i=1;i< nums.length;i++){
            int ith = nums[i];
            int j = i-1;
            while (j>=0 && nums[j]>ith)
            {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = ith;
        }
    }
}
