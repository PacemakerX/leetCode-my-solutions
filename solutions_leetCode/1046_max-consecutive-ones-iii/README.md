# Max Consecutive Ones Iii

**Question ID**: 1046  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 37 ms  
**Memory**: 58.2 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/max-consecutive-ones-iii

class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int i=0,j=0;
        while(j<nums.size()){
            if(nums[j]==0){
                k--;
            }
            if(k<0){
                if(nums[i]==0){
                    k++;
                }
                i++;
            }
            j++;
        }
        return j-i;
    }
};
```
