package com.kickinterview.sorting.foundation;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class HeapSort {

    public static void main(String[] args) {
        int[] nums = new int[]{7,3,1,5,8};
        heapSort(nums);
        for(int i:nums)
            System.out.println(i);

        System.out.println("===========Arrays API=============");
        nums = new int[]{7,3,1,5,8};

        Arrays.sort(nums);
        for(int i:nums)
            System.out.println(i);

    }

    private static void heapSort(int[] nums) {
        //default is ascending sort
      //  PriorityQueue<Integer> pq = new PriorityQueue<>();

        //for descencding sort
       // PriorityQueue<Integer> pq = new PriorityQueue<>((x,y)->Integer.compare(y,x));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());


        for(int i : nums)
            pq.add(i);

        for(int i=0;i<nums.length;i++)
            nums[i] = pq.remove();
    }
}
