#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/continuous-subarrays
class Solution
{
public:
    long long continuousSubarrays(vector<int> &nums)
    {

        int lo = 0, hi = 0;

        int n = nums.size();
        int currMax = nums[0], currMin = nums[0], len;

        long long count = 0;

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

                while (lo > 0 && abs(nums[hi] - nums[lo]) <= 2)
                {
                    lo--;
                    currMax = max(currMax, nums[lo]);
                    currMin = min(currMin, nums[lo]);
                }

                if (left < right)
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

int main()
{
    Solution obj;

    vector<int> a = {5, 4, 2, 4};

    obj.continuousSubarrays(a);
    return 0;
}