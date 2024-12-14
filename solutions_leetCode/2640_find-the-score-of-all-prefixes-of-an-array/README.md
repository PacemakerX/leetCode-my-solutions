# Find the Score of All Prefixes of an Array

**Question ID**: 2640  
**Language**: C++  
**Status**: Accepted  
**Runtime**: 0 ms 
**Memory**: 58.91  MB

## Solution Code
```cpp
//https://leetcode.com/problems/find-the-score-of-all-prefixes-of-an-array/
class Solution {
public:
    vector<long long> findPrefixScore(vector<int>& nums) {
        int currMax = nums[0];
        vector<long long> ans(nums.size());

        for (int i = 0; i < nums.size(); i++)
        {
            currMax = max(currMax, nums[i]);

            ans[i] = nums[i] + currMax;

            if (i)
                ans[i] += ans[i - 1];
        }

        return ans;
    }
};
```
