# Append K Integers With Minimal Sum

**Question ID**: 2305  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 2738 ms  
**Memory**: 106 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/append-k-integers-with-minimal-sum

class Solution {
public:
    long long minimalKSum(vector<int>& nums, int k) {
    
    set<int> s;

    for (auto v : nums)
        s.insert(v);

    auto it = s.begin();
    long long sum = 0;

    for (int i = 1;; i++)
    {

        if (it != s.end())
        {

            if (*it != i)
            {
                sum += i;
                k--;
            }
            else
                it++;
        }
        else
        {
            sum += i;
            k--;
        }

        if (k == 0)
            break;
    }

    return sum;
    }
};
```
