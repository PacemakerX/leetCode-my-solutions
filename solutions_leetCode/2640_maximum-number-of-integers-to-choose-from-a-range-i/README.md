# Maximum Number Of Integers To Choose From A Range I

**Question ID**: 2640  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 248 ms  
**Memory**: 181.6 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i

class Solution {
public:
    int maxCount(vector<int>& banned, int n, int maxSum) {
         set<int> s;

    for(int i=1;i<=n;i++)
        s.insert(i);

    for (auto i : banned)
        s.erase(i);

    int sum = 0, cnt = 0;
    for (auto v : s)
    {

        if (v + sum <= maxSum)
        {
            sum += v;
            cnt++;
        }
        else
            break;
    }

    return cnt;
    }
};
```
