# Intersection of Multiple Arrays

**Question ID**: 2248  
**Language**: C++  
**Status**: Accepted  
**Runtime**: 0 ms 
**Memory**: 17.4  MB

## Solution Code
```cpp
//https://leetcode.com/problems/intersection-of-multiple-arrays
class Solution {
public:
    vector<int> intersection(vector<vector<int>>& nums) {

        map<int,int> freq;
        vector<int> ans;

        for(auto i  : nums){
            for(auto j : i){
                freq[j]++;
                }
            }
        
        
        map<int, int>::iterator it=freq.begin();

        while(it!=freq.end()){

            if(freq[it->first]==nums.size())
                ans.push_back(it->first);

            ++it;
        }
        return ans;
    }
};
```
