# Greatest Common Divisor Of Strings

**Question ID**: 1146  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 8.7 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/greatest-common-divisor-of-strings

class Solution {
public:
    string gcdOfStrings(string str1, string str2) {
        return (str1 + str2 == str2 + str1)? 
        str1.substr(0, gcd(size(str1),size(str2))): "";
    }
};
```
