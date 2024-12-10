#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/successful-pairs-of-spells-and-potions

class Solution {
public:

int check(int spell, long long  sucess, vector<int> &potions)
{
    int lo = 0, hi = potions.size()-1, mid, ans = -1;

    while (lo <= hi)
    {
        mid = lo + (hi - lo) / 2;
        long long power = ( long long ) potions[mid] * spell;
        if (power >= sucess)
        {
            ans = mid;
            hi = mid - 1;
        }
        else
            lo = mid + 1;
    }

    return ans;
}
vector<int> successfulPairs(vector<int> &spells, vector<int> &potions, long long success)
{
    sort(potions.begin(), potions.end());

    vector<int> ans;
    for (int i = 0; i < spells.size(); i++)
    {
        int k = check(spells[i], success, potions);

        if (k == -1)
            ans.push_back(0);
        else
            ans.push_back(potions.size() - k );
    }

    return ans;
}

};