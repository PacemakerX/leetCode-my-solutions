import java.util.*;
// https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i

class Solution {
    public int minOperations(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int start=0,end=nums.length-1;
        int mid=0;
        
        while(start<=end){
            mid=start+(end-start)/2;
            
            if(nums[mid]==k)
                    end=mid-1;
            else if(nums[mid]<k)
                    start=mid+1;
            else if(nums[mid]>k)
                    end=mid-1;
        }
        return end+1;
    }
    
    
}