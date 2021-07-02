package com.kickinterview.sorting.foundation;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Meeting {

    public static void main(String[] args) {
        can_attend_all_meetings(null);
    }

    public static int can_attend_all_meetings(List<List<Integer>> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(a -> a.get(0)));

        Collections.reverseOrder();

       int indx = Collections.binarySearch(intervals.get(0),45);

       return indx;
    }

}
