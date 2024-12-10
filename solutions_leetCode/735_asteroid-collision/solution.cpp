#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/asteroid-collision

class Solution {
public:
   vector<int> asteroidCollision(vector<int> &asteroids)
{

    vector<int> ans;

    stack<int> st;
    for (auto i : asteroids)
    {
        int target = i;

        while (!st.empty() && target != 0 && (st.top()>0 && target < 0))
        {

            if (abs(st.top()) > abs(target))
                target = 0;
            else if (abs(st.top()) < abs(target))
                st.pop();
            else
            {
                target = 0;
                st.pop();
            }
        }

        if (target != 0)
            st.push(target);
    }

    while (!st.empty())
    {
        ans.push_back(st.top());
        st.pop();
    }

    reverse(ans.begin(), ans.end());

    return ans;
}
};