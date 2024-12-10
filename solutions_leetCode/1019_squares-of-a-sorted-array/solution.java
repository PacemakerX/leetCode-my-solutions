import java.util.*;
// https://leetcode.com/problems/squares-of-a-sorted-array


class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int start = 0, end = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[start]) >= Math.abs(nums[end])) {
                ans[i] = nums[start] * nums[start];
                start++;
            } else {
                ans[i] = nums[end] * nums[end];
                end--;
            }
        }
        return ans;
    }
}
