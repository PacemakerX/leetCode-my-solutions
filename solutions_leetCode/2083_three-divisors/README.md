# Three Divisors

**Question ID**: 2083  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 7 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/three-divisors

class Solution {
public:
    bool isThree(int n) {

        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)count++;
            
        }
        if(count==3)
            return true;
        else
        return false;
    }
};
```
