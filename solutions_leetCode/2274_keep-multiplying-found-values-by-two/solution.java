import java.util.*;
// https://leetcode.com/problems/keep-multiplying-found-values-by-two

class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i =0;i<nums.length;i++){
            if(nums[i]==original ){

             return findFinalValue(nums,original*2);
            }
        }
        return original;
    }
}