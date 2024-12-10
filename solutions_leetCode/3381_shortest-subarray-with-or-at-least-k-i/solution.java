import java.util.*;
// https://leetcode.com/problems/shortest-subarray-with-or-at-least-k-i

class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        
        int len=51;
        
        for(int i=0;i<nums.length;i++){
            int or =nums[i];
            for(int j=i;j<nums.length;j++){
                or= or | nums[j];
                 if(or>=k){
                    len=Math.min(len,j-i+1);
                }
            }

        }
        return len==51?-1:len;
    }
}