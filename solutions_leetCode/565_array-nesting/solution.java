import java.util.*;
// https://leetcode.com/problems/array-nesting

class Solution {
    public int arrayNesting(int[] nums) {

        int n=nums.length-1;
        int max=0;

        for(int i=0;i<=n;i++){
            
            if(nums[i]!=-1){
                int j=i;
                int count=0;
                while(nums[j]!=-1){
                    count++;
                    int k=nums[j];
                    nums[j]=-1;
                    j=k;

                }
                max=Math.max(max,count);
            }

        }
        return max;
    }
}