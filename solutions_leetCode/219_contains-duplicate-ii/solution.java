import java.util.*;
// https://leetcode.com/problems/contains-duplicate-ii

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){

            if(i>k)
                map.remove(nums[i-k-1]);
            
            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i])-i)<=k)
                return true;
            
            map.put(nums[i],i);
        }
        return false;
    }
}