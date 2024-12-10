# Search Suggestions System

**Question ID**: 1397  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 824 ms  
**Memory**: 341.1 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/search-suggestions-system

class Solution {
public:

 


    vector<string> parse(vector<string>& products, string searchWord){
        int cnt=0;

        vector<string> v;
        for(string s : products){
            if(s.substr(0,searchWord.length())==searchWord){
                cnt++;
                if(cnt<=3)
                    v.push_back(s);
                else
                    break;
            }
        }
        return v;
    }
    vector<vector<string>> suggestedProducts(vector<string>& products, string searchWord) {
        


        sort(products.begin(),products.end());
        vector<vector<string>> ans;

        for(int i=1;i<=searchWord.length();i++){

            vector<string> st=parse(products,searchWord.substr(0,i));
            ans.push_back(st);
        }

        return ans;
    }
};
```
