# Running Sum Of 1d Array

**Question ID**: 1603  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 3 ms  
**Memory**: 10.5 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/running-sum-of-1d-array

class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {

        for(int i=1;i<nums.size();i++)
            nums[i]+=nums[i-1];
        return nums;
    }
};
```
