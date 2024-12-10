import java.util.*;
// https://leetcode.com/problems/n-repeated-element-in-size-2n-array

class Solution {
    public int repeatedNTimes(int[] nums) {
        int i,j;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return nums[i];
    }
}