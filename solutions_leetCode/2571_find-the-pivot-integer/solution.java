import java.util.*;
// https://leetcode.com/problems/find-the-pivot-integer

class Solution {
    public int pivotInteger(int n) {

        int start=1,end=n,mid=0;

        while(start<=end){

            mid=start+(end-start)/2;

            int preSum=mid*(mid+1)/2;
            int postSum= n*(n+1)/2-preSum+mid;

            if(preSum==postSum)
                return mid;
            else if(preSum<postSum)
                start=mid+1;
            else
                end=mid-1;

        }
        return -1;
        
    }
}