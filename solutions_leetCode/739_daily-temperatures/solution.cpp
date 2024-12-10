#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/daily-temperatures

class Solution {
public:
    vector<int> dailyTemperatures(vector<int> &temperatures)
{
    stack<int> st;
    vector<int> ans(temperatures.size(), 0);
    for (int i = 0; i < temperatures.size(); i++)
    {
        if (st.empty())
        {
            st.push(i);
        }
        else
        {

            while (!st.empty() && temperatures[st.top()] < temperatures[i])
            {
                ans[st.top()] = i - st.top();
                st.pop();
            }

            st.push(i);
        }
    }

    return ans;
}

};