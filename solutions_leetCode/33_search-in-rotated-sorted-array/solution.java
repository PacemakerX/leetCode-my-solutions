import java.util.*;
// https://leetcode.com/problems/search-in-rotated-sorted-array

class Solution {
       public  int search(int[] nums, int target) {
        int index = 0;
        int max=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i] ) {
                index = i;
                max=nums[i];
            }
        }
        if (target >= nums[0] && target <= nums[index])
            return binarySearch(nums, 0, index, target);
        // if (target >= nums[index + 1] && target < nums[index])
        else
        return binarySearch(nums, index + 1, nums.length - 1, target);
    }

    public  int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid])
                start = mid + 1;
            else if (target < arr[mid])
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}