# Generate Parentheses

**Question ID**: 22  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 5 ms  
**Memory**: 10.3 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/generate-parentheses

class Solution {
public:


    bool check(string str){

        int sum=0;
        for(int i=0;i<str.size();i++){

            if(str[i]=='(')
                sum++;
            else
                sum--;

            if(sum<0)
                return false;

        }
        return true;
    }
    vector<string> generateParenthesis(int n) {

       string str="";

       vector<string> arr;


       for(int i=0;i<n;i++)
        str+='(';

        for(int i=0;i<n;i++)
        str+=')';

        do{

            if(check(str))
                arr.push_back(str);

        }while(next_permutation(str.begin(),str.end()));
        

        return arr;
    }
};
```
