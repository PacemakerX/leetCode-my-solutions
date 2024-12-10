# Clear Digits

**Question ID**: 3447  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 7.5 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/clear-digits

class Solution {
public:
    string clearDigits(string s) {
        
        int i=0;
        while(i<s.length()){
            int n=(int)s[i];
            if(n>=48 && n<=57 ){
                s.erase(s.begin()+i);
                s.erase(s.begin()+i-1);
                i--;
            }
            else
                i++;
        }
      return s;  
    }
};
```
