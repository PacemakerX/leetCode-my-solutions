import java.util.*;
// https://leetcode.com/problems/maximum-number-of-operations-with-the-same-score-i

class Solution {
    public int maxOperations(int[] nums) {
        
        int count=0;
        int prevSum=nums[0]+nums[1];
        count++;
        for(int i=2;i<nums.length-1;i+=2){
            if(prevSum==nums[i]+nums[i+1])
                count++;
            else break;
        }
        return count;
        
    }
}