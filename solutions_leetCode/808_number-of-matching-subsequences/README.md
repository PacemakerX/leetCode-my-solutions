# Number Of Matching Subsequences

**Question ID**: 808  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 1003 ms  
**Memory**: 49 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/number-of-matching-subsequences

class Solution {
public:

string t;
 bool isSubsequence(string s) {

        if(s.length()>t.length())
            return false;
        
        bool isSequence=true;;

            int j=0;
        for(int i=0;i<t.length();i++){


            while(i<t.length()&& j<s.length()){
                if(s[j]==t[i]){
                    j++;
                }
                    i++;
            }
            
            if(j<s.length())
                isSequence=false;
        }
        
        return isSequence;
    }
    int numMatchingSubseq(string s, vector<string>& words) {
    
    t=s;
     int cnt=0;

    unordered_map<string,int> mp;
     for(string str : words){
        mp[str]++;
     }   

     for(auto itr: mp){
        cnt+= isSubsequence(itr.first) * itr.second;
     }

     return cnt;
    }
};
```
