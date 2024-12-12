#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/take-gifts-from-the-richest-pile
class Solution
{
public:
    long long pickGifts(vector<int> &gifts, int k)
    {

        priority_queue<int> pq;

        for (int i = 0; i < gifts.size(); i++)
        {
            pq.push(gifts[i]);
        }

        while (k--)
        {
            int top = pq.top();
            top = floor(sqrt(top));
            pq.pop();
            pq.push(top);
        }

        long long sum = 0;
        while (!pq.empty())
        {
            sum += pq.top();
            pq.pop();
        }

        return sum;
    }
};
