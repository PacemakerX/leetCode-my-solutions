import java.util.*;
// https://leetcode.com/problems/concatenation-of-array

class Solution {
    public int[] getConcatenation(int[] nums) {
         int[] ans = new int[2 * nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i % nums.length];
        }
        return ans;
    }
}