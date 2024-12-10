#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/max-number-of-k-sum-pairs

class Solution {
public:
    int maxOperations(vector<int>& nums, int k) {


     sort(nums.begin(),nums.end());

     int cnt=0;
     int low=0,high=nums.size()-1;

     while(low<high){
        long long int sum=nums[low]+nums[high];
        if(sum==k){
            low++;
            high--;
            cnt++;
        }else if(sum<k){
            low++;
        }else
            high--;
     }

     return cnt;   
    }
};