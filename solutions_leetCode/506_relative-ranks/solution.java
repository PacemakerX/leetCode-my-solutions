import java.util.*;
// https://leetcode.com/problems/relative-ranks

class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        int[] nums =new int[score.length];
        for(int i=0;i<score.length;i++)
            nums[i]=score[i];
        
        Arrays.sort(nums);
        HashMap<Integer,String> map= new HashMap<>();
        for(int i=nums.length-1;i>=0;i--)
            if(i==nums.length-1)
                map.put(nums[i],"Gold Medal");
        else if(i==nums.length-2)
            map.put(nums[i],"Silver Medal");
        else if(i==nums.length-3)
            map.put(nums[i],"Bronze Medal");
        else
            map.put(nums[i],nums.length-i+"");
        
        String[] ans = new String[score.length];
        
        for(int i=0;i<score.length;i++)
            ans[i]=map.get(score[i]);

       return ans; 
        
    }
}