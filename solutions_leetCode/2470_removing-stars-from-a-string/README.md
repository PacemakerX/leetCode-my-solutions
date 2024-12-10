# Removing Stars From A String

**Question ID**: 2470  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 97 ms  
**Memory**: 27.5 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/removing-stars-from-a-string

class Solution {
public:
    string removeStars(string s) {
        
        
        stack<char> st;
        
        string ans="";
        for(auto ch : s){
            if(ch!='*'){
                ans+=ch;
            }
            else{
                ans.erase(ans.length()-1);
            }
        }
        return ans;
    }
};
```
