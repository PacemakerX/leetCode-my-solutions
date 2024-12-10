#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/removing-stars-from-a-string

class Solution {
public:
    string removeStars(string s) {
        
        
        stack<char> st;
        
        string ans="";
        for(auto ch : s){
            if(ch!='*'){
                ans+=ch;
            }
            else{
                ans.erase(ans.length()-1);
            }
        }
        return ans;
    }
};