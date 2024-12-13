# Find Score of an Array After Marking All Elements

**Question ID**: 2593  
**Language**: C++  
**Status**: Accepted  
**Runtime**: 61 ms  
**Memory**: 98.9 MB  

## Solution Code
```cpp
// http://leetcode.com/problems/find-score-of-an-array-after-marking-all-elements
class Solution
{
public:
    long long findScore(vector<int> &nums)
    {
        vector<pair<int, int>> sorted(nums.size());

        for (int i = 0; i < nums.size(); i++)
        {
            sorted[i] = make_pair(nums[i], i);
        }

        vector<bool> marked(nums.size(), false);

        sort(sorted.begin(), sorted.end());

        long long score = 0;
        for (int i = 0; i < sorted.size(); i++)
        {

            if (!marked[sorted[i].second])
            {
                score += sorted[i].first;
                marked[sorted[i].second] = true;

                if (sorted[i].second - 1 >= 0)
                    marked[sorted[i].second - 1] = true;

                if (sorted[i].second + 1 < nums.size())
                    marked[sorted[i].second + 1] = true;
            }
        }

        return score;
    }
};
```
