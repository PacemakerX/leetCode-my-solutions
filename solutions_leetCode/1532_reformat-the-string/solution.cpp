#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/reformat-the-string


using namespace std;
class Solution {

public:
    
    string reformat(string s) {
        
        string ch="";
        string nums="";
        
        for(auto c :s){
            if( isdigit(c))
                nums+=c;
            else
                ch+=c;

        }
        if (abs(static_cast<int>(nums.size()) - static_cast<int>(ch.size())) > 1)
           
            return "";
       
        string ans="";
        
    
           
           if(ch.size()>nums.size()){
               for(int i=0;i<ch.size();i++){
                   ans+=ch[i];
                   if(i<nums.size())
                       ans+=nums[i];
                   }
               }
           else{
                 for(int i=0;i<nums.size();i++){
                   ans+=nums[i];
                   if(i<ch.size())
                       ans+=ch[i];
                   }
               
           }
           
           
           
        
            
return ans;
            
        
    }
};