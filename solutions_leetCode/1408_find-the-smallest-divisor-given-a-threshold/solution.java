import java.util.*;
// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold

class Solution {
   public  int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        int start = 1, end = max, mid = 0;
        boolean checkVal = false;

        while (start <= end) {
            mid = start + (end - start) / 2;
            checkVal = check(nums, mid, threshold);
            if (checkVal == true)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;

    }

    public  boolean check(int[] nums, int n, int threshold) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.ceil((double) nums[i] / n);
        }
        return sum <= threshold;
    }

}