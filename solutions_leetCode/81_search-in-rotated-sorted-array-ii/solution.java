import java.util.*;
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii

class Solution {
    public boolean search(int[] nums, int target) {

        int pvt=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                pvt=i;
                while(i<nums.length-1 && nums[i+1]==max){
                pvt++;
                i++;
                }
            }
        }

        if(target>nums[pvt])
        return false;
        else if(target <=nums[pvt] && target >= nums[0])
        return binSearch(nums,0,pvt,target);
        else
        return binSearch( nums, pvt+1,nums.length-1,target);
    }

    public boolean binSearch(int [] nums,int start,int end,int target){
        int mid=0;
        while(start<=end){
            
            mid=start+(end-start)/2;

            if(nums[mid]<target)
                start=mid+1;
            else if(nums[mid]>target)
                end=mid-1;
            else
            return true;
        }
        return false;
    }
}