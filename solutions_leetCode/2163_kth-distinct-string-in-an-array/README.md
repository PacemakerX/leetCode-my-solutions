# Kth Distinct String In An Array

**Question ID**: 2163  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 8 ms  
**Memory**: 18.6 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/kth-distinct-string-in-an-array

class Solution {
public:


    string kthDistinct(vector<string>& arr, int k) {

        unordered_map<string,int> mp;

        for(auto i : arr) 
            mp[i]++;

        for(auto i : arr){

            if( mp[i]== 1){
                k--;
                if(k==0)
                    return i;
            }
        }

        return "";


    }
};
```
