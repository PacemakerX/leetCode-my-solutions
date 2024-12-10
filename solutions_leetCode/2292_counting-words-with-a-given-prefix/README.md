# Counting Words With A Given Prefix

**Question ID**: 2292  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 13.4 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/counting-words-with-a-given-prefix

class Solution {
public:
    int prefixCount(vector<string>& words, string pref) {


        int count=0;
        for(int i=0;i<words.size();i++){
            string str=words[i];
            
            if(str.find(pref)==0)
                count++;
        
        }
        
        return count;
    }
};
```
