import java.util.*;
// https://leetcode.com/problems/ant-on-the-boundary

class Solution {
    public int returnToBoundaryCount(int[] nums) {

        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }

        int count=0;
        for(int i : nums)
            if(i==0)
                count++;

        return count;
    }
}