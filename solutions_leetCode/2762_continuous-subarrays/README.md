# Continuous Subarrays

**Question ID**: 2762  
**Language**: C++  
**Status**: Accepted  
**Runtime**: 92 ms  
**Memory**: 111.86 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/continuous-subarrays
class Solution {
public:
    long long continuousSubarrays(vector<int> &nums)
    {

        int lo = 0, hi = 0;

        int n = nums.size();
        int currMax = nums[0], currMin = nums[0];

        long long count = 0,len;

        for (hi = 0; hi < n; hi++)
        {
            currMax = max(currMax, nums[hi]);
            currMin = min(currMin, nums[hi]);

            if (currMax - currMin > 2)
            {

                len = hi - lo;

                count += (len * (len + 1) / 2);

                currMax = currMin = nums[hi];

                lo = hi;

                while (lo > 0 && abs(nums[hi] - nums[lo-1]) <= 2)
                {
                    lo--;
                    currMax = max(currMax, nums[lo]);
                    currMin = min(currMin, nums[lo]);
                }

                if (lo < hi)
                {
                    len = hi - lo;

                    count -= (len * (len + 1) / 2);
                }
            }
        }
        len = hi - lo;

        count += (len * (len + 1) / 2);

        return count;
        
    }
};
```
