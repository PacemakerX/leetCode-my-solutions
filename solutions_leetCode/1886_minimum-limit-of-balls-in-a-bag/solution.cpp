#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag

class Solution {
public:
    int minimumSize(vector<int>& nums, int maxOperations) {

        sort(nums.begin(),nums.end());

        int lo=1,hi=nums[nums.size()-1],mid,res=-1;


        while(lo<=hi){
            mid=lo+(hi-lo)/2;

            if(check(nums,mid,maxOperations)){
                res=mid;
                hi=mid-1;
            }else
                lo=mid+1;
        }
        
        return res;
    }

    bool check(vector<int>& nums,int val, int maxOperations){


        int ops=0;
        for(int i=nums.size()-1;i>=0;i--){

             ops += ((nums[i]-1)/val);

            if(ops>maxOperations)
                return false;
        }


        return true;
    }
};