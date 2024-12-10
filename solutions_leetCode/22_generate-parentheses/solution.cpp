#include <bits/stdc++.h>
using namespace std;
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