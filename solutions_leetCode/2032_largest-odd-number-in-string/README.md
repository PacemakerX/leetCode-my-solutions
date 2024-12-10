# Largest Odd Number In String

**Question ID**: 2032  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 22 ms  
**Memory**: 16.1 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/largest-odd-number-in-string

class Solution {
public:
    string largestOddNumber(string num) {

        if(num.back()%2)
            return num;
        
        int i=num.length()-1;

        while(i>=0){
            if(num[i] % 2 == 1)
                return num.substr(0,i+1);
            i--;
        }

        return "";
    }
};
```