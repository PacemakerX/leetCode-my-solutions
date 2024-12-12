# Take Gifts From the Richest Pile

**Question ID**: 2558  
**Language**: C++  
**Status**: Accepted  
**Runtime**: 3 ms  
**Memory**: 12.97 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/take-gifts-from-the-richest-pile
class Solution
{
public:
    long long pickGifts(vector<int> &gifts, int k)
    {

        priority_queue<int> pq;

        for (int i = 0; i < gifts.size(); i++)
        {
            pq.push(gifts[i]);
        }

        while (k--)
        {
            int top = pq.top();
            top = floor(sqrt(top));
            pq.pop();
            pq.push(top);
        }

        long long sum = 0;
        while (!pq.empty())
        {
            sum += pq.top();
            pq.pop();
        }

        return sum;
    }
};
```
