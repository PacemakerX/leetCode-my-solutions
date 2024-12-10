# Minimum Levels To Gain More Points

**Question ID**: 3355  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 10 ms  
**Memory**: 60 MB  

## Solution Code
```java
// https://leetcode.com/problems/minimum-levels-to-gain-more-points

class Solution {
    public int minimumLevels(int[] possible) {
        
        for(int i =0;i<possible.length;i++){
            if(possible[i]==0)
                    possible[i]=-1;
            
        }   
        
        int bob=0;
        
        for(int i : possible)
                bob+=i;
        
        int daniel=0;
        
        for(int i=0;i<possible.length-1;i++)
        {
            daniel+=possible[i];
            bob += -1*possible[i];
            if(daniel>bob)
                return i+1;
        }
        return -1;
    }
}
```
