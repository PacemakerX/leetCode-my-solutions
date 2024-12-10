import java.util.*;
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i=0;
        for(int ele: nums ){
            
            if(i==0 || i== 1 || nums[i-2]!=ele)
nums[i++]=ele;



        }
        return i;
    }
}