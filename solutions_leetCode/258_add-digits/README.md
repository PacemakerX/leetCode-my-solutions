# Add Digits

**Question ID**: 258  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 8.5 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/add-digits

class Solution {
public:
    int addDigits(int num) {
        
        while(num>9){
            int temp=0;
        while(num>0){
            temp+=num%10;
            num/=10;
        }
        num=temp;
        }

        return num;
    }
};
```
