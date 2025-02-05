#include <bits/stdc++.h>
using namespace std;

//https://leetcode.com/problems/shifting-letters-ii

class Solution {
public:
    string shiftingLetters(string s, vector<vector<int>> &shifts)
    {
        vector<int> arr;

        arr.resize(s.size(), 0);

        for (auto i : shifts)
        {
            int start = i[0];
            int end = i[1];
            int dir = i[2] == 1 ? 1 : -1;

            arr[start] += dir;
            if (end < arr.size() - 1)
                arr[end + 1] += -dir;
        }

        for (int i = 1; i < arr.size(); i++)
        {
            arr[i] += arr[i - 1];
        }

        for (int i = 0; i < s.size(); i++)
        {
            char ch = s[i];
             int netShift = (arr[i] % 26 + 26) % 26;
            s[i] = (char)('a' + (s[i] - 'a' + netShift + 26) % 26);
        }

        return s;
    }
};