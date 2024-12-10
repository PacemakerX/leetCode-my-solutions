# Permutations Ii

**Question ID**: 47  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 9.9 MB  

## Solution Code
```cpp
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
```
