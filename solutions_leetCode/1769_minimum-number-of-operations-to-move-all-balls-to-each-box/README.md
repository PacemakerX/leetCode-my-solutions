# Minimum Number of Operations to Move All Balls to Each Box

**Question ID**: 1769  
**Language**: C++  
**Status**: Accepted  
**Runtime**: 148 ms 
**Memory**: 14.5  MB

## Solution Code
```cpp
//https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box
class Solution {
public:
       vector<int> minOperations(string boxes)
    {
        set<int> s;
        vector<int> ans;
        for (int i = 0; i < boxes.size(); i++)
        {
            if (boxes[i] == '1')
            {

                s.insert(i);
            }
        }

        for (int i = 0; i < boxes.size(); i++)
        {
            int sum = 0;

            for (auto it : s)
            {
                if (it == i)
                    continue;

                sum += (abs(i-it));
            }

            ans.push_back(sum);
        }

        return ans;
    }
};
```
