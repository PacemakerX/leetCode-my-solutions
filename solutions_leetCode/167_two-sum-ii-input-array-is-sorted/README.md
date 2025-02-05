# Two Sum II - Input Array Is Sorted

**Question ID**: 167  
**Language**: C++  
**Status**: Accepted  
**Runtime**: 0 ms 
**Memory**: 19.41  MB

## Solution Code
```cpp
//https://leetcode.com/problems/two-sum-ii---input-array-is-sorted
class Solution
{
public:

    vector<int> twoSum(vector<int> &numbers, int target)
    {

        vector<int> ans(2);
        
        int low=0,high=numbers.size()-1;

        while(low<high){
            int sum=numbers[low]+numbers[high];
            if(sum==target)
                return {++low,++high};
            else if(sum>target){
                high--;
            }else
                low++;
        }

        return {0,0};
    }
};
```
