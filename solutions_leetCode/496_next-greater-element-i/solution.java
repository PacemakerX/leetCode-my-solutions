import java.util.*;
// https://leetcode.com/problems/next-greater-element-i

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int ans[] = new int [nums1.length];

        Arrays.fill(ans,-1);
        boolean bool =false;
        for(int i=0;i<nums1.length;i++){        
            bool =false;

            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j])
                    bool=true;
                
                if(bool && nums2[j]>nums1[i]){
                    ans[i]=nums2[j];
                    break;
                }
            }
        }
        return ans;
        
    }
}