# Intersection of Two Arrays II

**Question ID**: 350  
**Language**: C++  
**Status**: Accepted  
**Runtime**: 0 ms 
**Memory**: 14.1  MB

## Solution Code
```cpp
//https://leetcode.com/problems/intersection-of-two-arrays-ii
class Solution {
public:
  vector<int> intersect(vector<int> &nums1, vector<int> &nums2)
    {
        sort(nums1.begin(), nums1.end());
        sort(nums2.begin(), nums2.end());
        vector<int> ans;
        set_intersection(nums1.begin(), nums1.end(), nums2.begin(), nums2.end(), back_inserter(ans));

        return ans;
    }
};
```
