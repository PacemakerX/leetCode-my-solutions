import java.util.*;
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array

class Solution {
    public int findMin(int[] nums) {
         int start = 0, end = nums.length - 1;
        int mid = 0;
        if (nums.length == 1)
            return nums[0];

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[mid] < nums[nums.length - 1])
                end = mid - 1;
            else if (nums[mid] > nums[nums.length - 1])
                start = mid + 1;
            else
            break;

        }
        return nums[start]; 
    }
}