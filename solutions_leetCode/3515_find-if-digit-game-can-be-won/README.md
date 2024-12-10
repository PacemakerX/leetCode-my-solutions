# Find If Digit Game Can Be Won

**Question ID**: 3515  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 13 ms  
**Memory**: 28.2 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/find-if-digit-game-can-be-won

class Solution {
public:
    bool canAliceWin(vector<int>& nums) {
        ios_base :: sync_with_stdio(false), cin.tie(0), cout.tie(0);

        int sum1=0;
        int sum2=0;
        for(int i : nums){

            if(i<10)
                sum1+=i;
            else
                sum2+=i;
        }
        
        return sum1!=sum2;
    }
};
```
