# Minimum Number Of Pushes To Type Word Ii

**Question ID**: 3276  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 84 ms  
**Memory**: 27.6 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii

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
