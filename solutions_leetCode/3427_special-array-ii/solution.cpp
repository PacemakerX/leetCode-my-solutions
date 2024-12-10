#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/special-array-ii

class Solution {
public:
    vector<bool> isArraySpecial(vector<int>& nums, vector<vector<int>>& queries) {
        
    map<int, int> group;
    group[0] = 1;

    for(int i=1;i<nums.size();i++)
    {
        if (nums[i] % 2 != nums[i - 1] % 2)
        {
            group[i] = group[i - 1];
        }
        else
            group[i] = group[i - 1] + 1;
    }

    vector<bool> ans;
    for( auto &v : queries){

        if(group[v[0]]==group[v[1]])
            ans.push_back(true);
            else
                ans.push_back(false);
    }

    return ans;
    }
};