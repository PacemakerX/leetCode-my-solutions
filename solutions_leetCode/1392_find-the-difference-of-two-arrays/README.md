# Find The Difference Of Two Arrays

**Question ID**: 1392  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 28 ms  
**Memory**: 36.3 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/find-the-difference-of-two-arrays

class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
   
    set<int> set1;
    set<int> set2;
    for (auto i : nums1)
        set1.insert(i);
    for (auto i : nums2)
        set2.insert(i);

    vector<int> diffA;
    vector<int> diffB;

    set_difference(set1.begin(), set1.end(), set2.begin(), set2.end(), back_inserter(diffA));
    set_difference(set2.begin(), set2.end(), set1.begin(), set1.end(), back_inserter(diffB));

    vector<vector<int>> ans;
    ans.push_back(diffA);
    ans.push_back(diffB);
    return ans;
    }
};
```
