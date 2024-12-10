# Power Of Two

**Question ID**: 231  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 5 ms  
**Memory**: 7.2 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/power-of-two

class Solution {
public:
    bool isPowerOfTwo(int n) {

        while(n>2 || n<-2){
            if(n%2==1 )
                return false;
            n=n>>1;
        }
        if(n<0)
            return false;
        return (bool)n;
    }
};
```
