# Minimum Size Subarray Sum

**Question ID**: 209  
**Language**: C++  
**Status**: Accepted  
**Runtime**: 0 ms 
**Memory**: 32.29  MB

## Solution Code
```cpp
//https://leetcode.com/problems/minimum-size-subarray-sum
class Solution
{
public:
    bool check(int num, vector<int> &nums, int target)
    {
        for (int i = 0; i + num - 1 < nums.size(); i++)
        {
            int sum = nums[i + num - 1] - (i > 0 ? nums[i - 1] : 0);
            if (sum >= target)
                return true;
        }

        return false;
    }
    int minSubArrayLen(int target, vector<int> &nums)
    {
        for (int i = 1; i < nums.size(); i++)
            nums[i] += nums[i - 1];

        int low = 1, high = nums.size(), ans = 0, mid;

        while (low <= high)
        {
            mid = low + (high - low) / 2;
            if (check(mid, nums, target))
            {
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }

        return ans;
    }
};
```
