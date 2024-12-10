import java.util.*;
// https://leetcode.com/problems/majority-element-ii

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> ls = new ArrayList<>();
        int el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;
        int cnt1=0,cnt2=0;

        for(int n:nums){

            if(cnt1==0 && n !=el2)
                el1=n;
            if(cnt2==0 && n!=el1)
                el2=n;
            if(n==el1)
                cnt1++;
            else if(n==el2) 
                cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        
        for(int num: nums){

            if(num==el1)
                cnt1++;
            if(num==el2)
                cnt2++;
        }
        if(cnt1 >Math.floor(nums.length/3))
            ls.add(el1);
        if(cnt2 >Math.floor(nums.length/3))
            ls.add(el2);
        return ls;
    }
}