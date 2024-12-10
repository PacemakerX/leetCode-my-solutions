# Smallest Number With All Set Bits

**Question ID**: 3676  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 8.2 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/smallest-number-with-all-set-bits

class Solution {
public:
    int smallestNumber(int n) {

        
    int ans=1;
        while(ans<=n)
            ans=ans*2;

        return ans-1;
    }
};
```
