import java.util.*;
// https://leetcode.com/problems/sort-colors

class Solution {
    public void sortColors(int[] nums) {
         for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;

            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
         }
    }
}