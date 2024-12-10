#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/number-of-senior-citizens

class Solution {
public:
    int countSeniors(vector<string>& details) {


    int cnt = 0;
    for (int i = 0; i < details.size(); i++)
    {
        string str = details[i];
        int num = stoi(str.substr(11, 2));

        if (num > 60)
            cnt++;
    }

    return cnt;
    }
};