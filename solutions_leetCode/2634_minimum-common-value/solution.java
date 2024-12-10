import java.util.*;
// https://leetcode.com/problems/minimum-common-value

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        int left=0, right=0,num=-1;

        while(left<nums1.length && right<nums2.length){

            if(nums1[left]<nums2[right])
                left++;
            else if(nums1[left]>nums2[right])
                right++;
            else{
                 num=nums1[left];
                break;
            }

        }
        return num;
        
    }
}