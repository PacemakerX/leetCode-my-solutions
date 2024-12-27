# Best Sightseeing Pair

**Question ID**: 1014  
**Language**: C++  
**Status**: Accepted  
**Runtime**: 26 ms 
**Memory**: 49.7  MB

## Solution Code
```cpp
//https://leetcode.com/problems/best-sightseeing-pair
class Solution {
public:
    int maxScoreSightseeingPair(vector<int>& values) {
        
        priority_queue<int> pq;

        pq.push(values[0]);

        int maxVal=0;

        for(int i=1;i<values.size();i++){

            maxVal=max(maxVal,pq.top()+values[i]-i);

            pq.push(values[i]+i);
        }

        return maxVal;
    }
};
```
