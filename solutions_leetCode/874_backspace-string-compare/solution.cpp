#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/backspace-string-compare

class Solution {
public:
    bool backspaceCompare(string s, string t) {

        string ans1="";

        string ans2="";

        for(auto ch: s){
            if(ch!='#')
                ans1+=ch;
            else
            if(ans1.length())
                ans1.erase(ans1.length()-1);
        }

                for(auto ch: t){
            if(ch!='#')
                ans2+=ch;
            else{
                if(ans2.length())
                    ans2.erase(ans2.length()-1);
            }
        }
        
        return ans1==ans2;
    }
};