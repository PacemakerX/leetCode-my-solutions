import java.util.*;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {search(nums, target, true),search(nums, target, false)};
        // System.out.println(Arrays.toString(ans));
    }

    public int search(int[] nums, int target, boolean findStart) {
        int start = 0, end = nums.length - 1;
        int ans=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid])
                start = mid + 1;
            else if (target < nums[mid])
                end = mid - 1;
            else {
                ans = mid;
                if (findStart)
                    end = mid - 1;
                else
                    start = mid + 1;

            }

        }
        return ans;
    }
    }