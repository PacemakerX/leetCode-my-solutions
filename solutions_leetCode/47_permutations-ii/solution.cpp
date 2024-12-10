#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/permutations-ii

class Solution {
public:
    vector<vector<int>> permuteUnique(vector<int>& nums) {
          vector<vector<int>> ans;

    sort(nums.begin(),nums.end());
    do
    {
        ans.push_back(nums);
        /* code */
    } while (next_permutation(nums.begin(),nums.end()));
    
    return ans;
    }
};