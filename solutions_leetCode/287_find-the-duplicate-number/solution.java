import java.util.*;
// https://leetcode.com/problems/find-the-duplicate-number

class Solution {
     public  int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, nums[i] - 1, i);
            } else
                i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j] - 1)
                return nums[j];
        }
        return -1;
    }

    public  void swap(int[] nums, int first, int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}