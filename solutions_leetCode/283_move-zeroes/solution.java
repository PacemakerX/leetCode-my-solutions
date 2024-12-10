import java.util.*;
// https://leetcode.com/problems/move-zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        
      int k=0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]==0){
                    k=i>k?i:k ;
                    while(k<nums.length && nums[k]==0  ){
                        k++;
                    }
                    if(k<nums.length)
                    swap(nums,i,k);
                }
                
            }
        }
        public static void swap(int[]a, int j,int k){
            int temp=a[j];
            a[j]=a[k];
            a[k]=temp;
        }
}