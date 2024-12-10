import java.util.*;
// https://leetcode.com/problems/largest-number-at-least-twice-of-others

class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[max]<nums[i])
            max=i;
            
        }
        for(int i=0;i<nums.length;i++){
            if(max!=i &&!(nums[max]>=2*nums[i]))
            return -1;
            
        }
        return max;
    }
}