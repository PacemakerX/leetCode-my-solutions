# Make String A Subsequence Using Cyclic Increments

**Question ID**: 3018  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 8 ms  
**Memory**: 17.1 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/make-string-a-subsequence-using-cyclic-increments

class Solution {
public:
    bool canMakeSubsequence(string str1, string str2) {

        int i=0,j=0,n1=str1.size(),n2=str2.size();
        int len=0;
        while(i<n1){
            while(i<n1 && j<n2){
                if(str1[i]==str2[j]){
                    len++;
                   j++;
                }else if(('a' + (str1[i] - 'a' + 1) % 26)==str2[j]){
                 j++;
                 len++;
               }

                   i++;
            }
               i++;
        }

       

        return (len==n2);
    }
};
```
