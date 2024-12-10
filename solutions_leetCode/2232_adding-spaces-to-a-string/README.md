# Adding Spaces To A String

**Question ID**: 2232  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 15 ms  
**Memory**: 85.8 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/adding-spaces-to-a-string

class Solution {
public:
    string addSpaces(string s, vector<int>& spaces) {


        string ans="";

        int ind=0;

        for(int i=0;i<s.size();i++){

            if(ind < spaces.size() && i==spaces[ind]){
                ans+=" ";
                ind++;
            }

            ans+=s[i];
        }
        
        return ans;
    }
};
```
