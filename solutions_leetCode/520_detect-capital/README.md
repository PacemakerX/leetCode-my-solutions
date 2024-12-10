# Detect Capital

**Question ID**: 520  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 7.9 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/detect-capital

class Solution {
public:
    
    bool checkUpper(string str){
        for(int i=0;i<str.length();i++){
            if(islower(str[i]))
                return false;

         
        }
        return true;
    }
    
    bool checkLower(string str,int k){
        for(int i=k;i<str.length();i++){
            if(isupper(str[i]))
                return false;

         
        }
        return true;
    }
    bool detectCapitalUse(string word) {
        
        return (checkUpper(word)||checkLower(word,0)||(isupper(word[0])&& checkLower (word,1)));
        
    }
};
```
