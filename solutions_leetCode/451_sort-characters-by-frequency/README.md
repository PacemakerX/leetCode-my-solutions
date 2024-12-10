# Sort Characters By Frequency

**Question ID**: 451  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 12 ms  
**Memory**: 11.2 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/sort-characters-by-frequency

class Solution {
public:
    string frequencySort(string s)
{

    multimap<int, char> mp;

    map<char,int>mpr;

    for (auto ch : s)
    {
        mpr[ch]++;
    }

    for(auto itr=mpr.begin();itr!=mpr.end();itr++)
        mp.insert(make_pair(itr->second,itr->first));


    string ans = "";
    for (auto itr = mp.rbegin(); itr != mp.rend(); ++itr)
    {
        int x = itr->first;

        while (x)
        {
            ans += itr->second; // Append the value to ans
            x--;
        }
    }

    return ans;
}
};
```
