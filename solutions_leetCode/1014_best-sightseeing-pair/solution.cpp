#include <bits/stdc++.h>
using namespace std;

// https://leetcode.com/problems/best-sightseeing-pair

class Solution
{
public:
    int maxScoreSightseeingPair(vector<int> &values)
    {

        priority_queue<int> pq;

        pq.push(values[0]);

        int maxVal = 0;

        for (int i = 1; i < values.size(); i++)
        {

            maxVal = max(maxVal, pq.top() + values[i] - i);

            pq.push(values[i] + i);
        }

        return maxVal;
    }
};