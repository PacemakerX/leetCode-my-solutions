#include <bits/stdc++.h>
using namespace std;

// https://leetcode.com/problems/sum-of-squares-of-special-elements

class Solution
{
public:
    int sumOfSquares(vector<int> &nums)
    {

        int sum = 0;

        int n = nums.size();
        for (int i = 0; i < nums.size(); i++)
        {
            if (n % (i + 1) == 0)
            {

                sum += (nums[i] * nums[i]);
            }
        }

        return sum;
    }
};
