#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/find-longest-special-substring-that-occurs-thrice-i

class Solution
{
public:
    bool check(string s, string str)
    {

        int count = 0;
        int n = s.size();
        int m = str.size();

        for (int i = 0; i < (n - m + 1); i++)
        {
            string p = s.substr(i, m);
            if (p == str)
                count++;
        }

        return count >= 3;
    }

    bool isspecial(string str)
    {
        char ch = str[0];

        for (int i = 0; i < str.size(); i++)
        {
            if (str[i] != ch)
                return false;
        }

        return true;
    }
    int maximumLength(string s)
    {

        int n = s.size();

        int ans = -1;

        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {

                string str = s.substr(i, j - i + 1);

                if (isspecial(str) && check(s, str))
                    ans = max(ans, j - i + 1);
            }
        }

        return ans;
    }
};
