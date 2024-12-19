#include <bits/stdc++.h>
using namespace std;

// https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i
class Solution
{
public:
    vector<int> getFinalState(vector<int> &nums, int k, int multiplier)
    {

        priority_queue<pair<int, int>> pq;

        for (int i = 0; i < nums.size(); i++)
        {
            pq.push(make_pair(-nums[i], -i));
        }

        while (k--)
        {
            int num = -pq.top().first;
            int index = -pq.top().second;
            num = num * multiplier;
            pq.pop();
            pq.push(make_pair(-num, -index));
        }

        while (pq.size() > 0)
        {
            nums[-pq.top().second] = -pq.top().first;
            pq.pop();
        }

        return nums;
    }
};
