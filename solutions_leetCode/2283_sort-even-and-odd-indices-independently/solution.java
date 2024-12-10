import java.util.*;
// https://leetcode.com/problems/sort-even-and-odd-indices-independently

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int [] even=new int[nums.length/2+nums.length%2];
        int [] odd=new int[nums.length/2];
        for(int i=0,j=0,k=0; i<nums.length; i++)
        {
            if(i%2==0)
                 even[j++]=nums[i];
            else 
                 odd[k++]=nums[i];
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        for(int i=0,j=0,k=odd.length-1; i<nums.length; i++)
        {
             if(i%2==0)
                 nums[i]=even[j++];
            else 
                 nums[i]=odd[k--];
        }
        return nums;
     }
}