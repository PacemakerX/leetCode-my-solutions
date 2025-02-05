#include <bits/stdc++.h>
using namespace std;

//https://leetcode.com/problems/intersection-of-multiple-arrays

class Solution {
public:
    vector<int> intersection(vector<vector<int>>& nums) {

        map<int,int> freq;
        vector<int> ans;

        for(auto i  : nums){
            for(auto j : i){
                freq[j]++;
                }
            }
        
        
        map<int, int>::iterator it=freq.begin();

        while(it!=freq.end()){

            if(freq[it->first]==nums.size())
                ans.push_back(it->first);

            ++it;
        }
        return ans;
    }
};