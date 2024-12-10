# Count Common Words With One Occurrence

**Question ID**: 2190  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 34 ms  
**Memory**: 24.2 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/count-common-words-with-one-occurrence

class Solution {
public:
    int countWords(vector<string>& words1, vector<string>& words2) {

        unordered_map <string,int> c1;
                unordered_map <string,int> c2;

        for(auto word : words1)
            c1[word]++;
        
        for(auto word : words2)
            c2[word]++;

        int cnt=0;


        for(auto word : words1){
            if(c1[word]==1 && c1[word]==c2[word])
                cnt++;
        }

        return cnt;
    }
};
```