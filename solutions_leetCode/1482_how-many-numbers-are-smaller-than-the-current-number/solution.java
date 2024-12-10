import java.util.*;
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
         int[] ls = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ls[i]=nums[i];
        }
        Arrays.sort(nums);

        for (int i = 0; i < ls.length; i++) {
           ls[i]=binSearch(nums,ls[i]);
        }
        return ls;
    }

    public static int binSearch(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid])
                start = mid + 1;
            else if (target < nums[mid])
                end = mid - 1;
            else {
                ans = mid;
                end = mid - 1;
            }

        }
        return ans;
    }
}