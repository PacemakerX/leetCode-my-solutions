import java.util.*;
// https://leetcode.com/problems/sort-array-by-parity

class Solution {
    public int[] sortArrayByParity(int[] nums) {
         for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] % 2 == 0 && nums[j - 1] % 2 != 0)
                    swap(nums, j, j - 1);
                else
                    break;

            }

        }
        return nums;
    }

    public static void swap(int[] nums, int first, int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
    }