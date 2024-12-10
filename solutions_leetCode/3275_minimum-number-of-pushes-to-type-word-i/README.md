# Minimum Number Of Pushes To Type Word I

**Question ID**: 3275  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 10.6 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i

class Solution {
public:
    int minimumPushes(string word) {


        vector<int> frequency(26,0);
        
        for(auto ch : word){
            
            frequency[ch-'a']++;
        }
        
        sort(frequency.rbegin(),frequency.rend());
        
        int pushes=0;
        
        for(int i=0;i<26;i++){
            
            if(frequency[i]==0)
                    break;
            pushes+=(i/8+1)*frequency[i];
        }
     return pushes;
        
    }
};
```
