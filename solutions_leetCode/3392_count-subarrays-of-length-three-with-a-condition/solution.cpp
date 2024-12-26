#include <bits/stdc++.h>
using namespace std;

// https://leetcode.com/problems/count-subarrays-of-length-three-with-a-condition

class Solution
{
public:
    int countSubarrays(vector<int> &nums)
    {

        int first = nums[0];
        int third = nums[2];
        int second = nums[1];

        int cnt = 0;

        for (int i = 2; i < nums.size(); i++)
        {
            third = nums[i];
            first = nums[i - 2];
            second = nums[i - 1];

            if (2 * (first + third) == second)
                cnt++;
        }

        return cnt;
    }
};
