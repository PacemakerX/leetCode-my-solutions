# Is Subsequence

**Question ID**: 392  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 7.8 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/is-subsequence

class Solution {
public:
    bool isSubsequence(string s, string t) {

        if(s.length()>t.length())
            return false;
        
        bool isSequence=true;;

            int j=0;
        for(int i=0;i<t.length();i++){


            while(i<t.length()&& j<s.length()){
                if(s[j]==t[i]){
                    j++;
                }
                    i++;
            }
            
            if(j<s.length())
                isSequence=false;
        }
        
        return isSequence;
    }
};
```
