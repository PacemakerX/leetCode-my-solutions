# Minimum Number Of Operations To Convert Time

**Question ID**: 2345  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 8.1 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/minimum-number-of-operations-to-convert-time

class Solution {
public:
   int convertTime(string current, string correct)
{

    int h1 = stoi(current.substr(0, 2));
    int h2 = stoi(correct.substr(0, 2));

    int m1 = stoi(current.substr(3, 2));
    int m2 = stoi(correct.substr(3, 2));

    if (m1 > m2)
    {
        m2 += 60;
        h2--;
    }
    int op = (h2 - h1);

    int diff = m2 - m1;
    if (diff >= 15)
    {
        op += diff / 15;
        diff = diff % 15;
    }
    if (diff >= 5)
    {
        op += diff / 5;
        diff = diff % 5;
    }

    op += diff;

    return op;
}};
```
