import java.util.*;
// https://leetcode.com/problems/find-all-duplicates-in-an-array

class Solution {
    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, nums[i] - 1, i);
            } else
                i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j] - 1)
                list.add(nums[j]);
        }
        return list;
    }

    public static void swap(int[] nums, int first, int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}