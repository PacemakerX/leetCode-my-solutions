import java.util.*;
// https://leetcode.com/problems/minimum-number-game

class Solution {
    public int[] numberGame(int[] nums) {
        
        Arrays.sort(nums);
        int temp=0;
        
        for(int i=1;i<nums.length;i+=2){
            temp=nums[i];
            nums[i]=nums[i-1];
            nums[i-1]=temp;
        }

    
    return nums;
}}