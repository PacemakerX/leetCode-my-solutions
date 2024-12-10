#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/is-subsequence

class Solution {
public:
    bool isSubsequence(string s, string t) {

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
};