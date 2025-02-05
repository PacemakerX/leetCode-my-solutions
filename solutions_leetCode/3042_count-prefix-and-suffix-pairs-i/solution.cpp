#include <bits/stdc++.h>
using namespace std;

//https://leetcode.com/problems/count-prefix-and-suffix-pairs-i

class Solution {
public:
      int countPrefixSuffixPairs(vector<string> &words)
    {
        int cnt = 0;
        int n = words.size();
        for (int i = 0; i < n; i++)
        {
            for (int j = i+1; j < n; j++)
            {
                if (words[i].size()>words[j].size())
                    continue;

                string s1 = words[i];
                string s2 = words[j];


                if (s1==s2.substr(0,s1.size()) && s1==s2.substr(s2.size()-s1.size(),s1.size()))
                    cnt++;
               
            }
        }

        return cnt;
    }
};
