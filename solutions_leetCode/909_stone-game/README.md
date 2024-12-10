# Stone Game

**Question ID**: 909  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 4 ms  
**Memory**: 9.5 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/stone-game

class Solution {
public:
    bool stoneGame(vector<int>& piles) {

        int low=0,high=0;


        int aliceSum=0,bobSum=0;

        int i=1;
        while(low<=high){
            int x;
            if(piles[low]>=piles[high]){
                x=piles[low];
                low++;
            }else{
                x=piles[high];
                    high--;
            }

            if(i%2)
                aliceSum+=x;
            else
                bobSum+=x;

            i++;
        }
        
        return aliceSum>bobSum;
    }
};
```
