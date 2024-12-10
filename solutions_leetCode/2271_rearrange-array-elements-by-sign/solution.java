import java.util.*;
// https://leetcode.com/problems/rearrange-array-elements-by-sign

class Solution {
    public int[] rearrangeArray(int[] nums) {
        
         int[] newNums= new int[nums.length];
        
        int eveNums=0,oddNums=1;
        for (int i : nums) {
            if(i>0){
                newNums[eveNums]=i;
                eveNums+=2;

            }
            else{
                newNums[oddNums]=i;
                oddNums+=2;
            }
        }
        return newNums;
    }
}