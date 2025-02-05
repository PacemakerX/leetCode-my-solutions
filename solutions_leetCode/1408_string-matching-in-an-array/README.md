# String Matching in an Array

**Question ID**: 1408  
**Language**: C++  
**Status**: Accepted  
**Runtime**: 5 ms 
**Memory**: 12  MB

## Solution Code
```cpp
//https://leetcode.com/problems/string-matching-in-an-array
class Solution {
public:
    vector<string> stringMatching(vector<string>& words) {

        vector<string> ans;

        for(auto i : words){
            for(auto j:words){
                if(i!=j){
                    if(j.find(i)!=string:: npos){
                        ans.push_back(i);
                        break;
                    }
                }
            }
        }


        return ans;
        
    }
};
```
