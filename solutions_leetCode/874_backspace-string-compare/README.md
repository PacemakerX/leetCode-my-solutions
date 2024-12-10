# Backspace String Compare

**Question ID**: 874  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 7.9 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/backspace-string-compare

class Solution {
public:
    bool backspaceCompare(string s, string t) {

        string ans1="";

        string ans2="";

        for(auto ch: s){
            if(ch!='#')
                ans1+=ch;
            else
            if(ans1.length())
                ans1.erase(ans1.length()-1);
        }

                for(auto ch: t){
            if(ch!='#')
                ans2+=ch;
            else{
                if(ans2.length())
                    ans2.erase(ans2.length()-1);
            }
        }
        
        return ans1==ans2;
    }
};
```
