#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/range-sum-query-immutable

class NumArray {
public:
    vector<int> arr;
    NumArray(vector<int>& nums) {
         arr.clear();
        for(auto i : nums)
        arr.push_back(i);
        
        for(int i=1;i<arr.size();i++){
            arr[i]+=arr[i-1];
        }
    }
    
    int sumRange(int left, int right) {
        int sum= arr[right]- (left>0?arr[left-1]:0);
        return sum;
    }
};

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray* obj = new NumArray(nums);
 * int param_1 = obj->sumRange(left,right);
 */