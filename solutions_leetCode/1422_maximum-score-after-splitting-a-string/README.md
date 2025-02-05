# Maximum Score After Splitting a String

**Question ID**: 1422  
**Language**: C++  
**Status**: Accepted  
**Runtime**: 0 ms 
**Memory**: 8.9  MB

## Solution Code
```cpp
//https://leetcode.com/problems/maximum-score-after-splitting-a-string
class Solution {
public:
    int maxScore(string s) {

        int zero=0,one=0;

        for(auto ch : s)
            if(ch=='0') zero++;
            else    one++;

        int ans=0;
        
        int cntZero=0,cntOne=0;

        for(int i=0;i<s.size()-1;i++){
            char ch=s[i];
            if(ch=='0'){
                ans=max(ans,++cntZero+(one-cntOne));
            }else{

                ans=max(ans,cntZero+(one- (++cntOne)));
            }
        }
        
        return ans;
    }
};
```
