import java.util.*;
// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets

class Solution {
        public  int minDays(int[] bloomDay, int m, int k) {

        if (bloomDay.length <(long)m * k)
            return -1;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            max = Math.max(max, bloomDay[i]);
            min = Math.min(min, bloomDay[i]);
        }

        int start = min, end = max, mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            boolean checkVal = check(bloomDay, mid, m, k);
            if (checkVal == true)
                end = mid - 1;
            else
                start = mid + 1;

        }
        return start;

    }

    public  boolean check(int[] bloomDay, int target, int m, int k) {

        int count = 0, totalCount = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= target)
                count++;
            else{
                totalCount += count / k;
                count = 0;
            }}

            totalCount += count / k;

        if (totalCount >= m)
            return true;
        else
            return false;
    }

}

