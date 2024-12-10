import java.util.*;
// https://leetcode.com/problems/max-consecutive-ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int max = 0, prevMax = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                max++;
                if (i == nums.length - 1) {
                    if (prevMax < max) 
                        prevMax = max;
                        max = 0;
                    
                }
            } else if (nums[i] == 0) {
                if (prevMax < max) 
                    prevMax = max;
                    max = 0;
            }
        }
        return prevMax;
        
    }
}