#include <bits/stdc++.h>
using namespace std;

//https://leetcode.com/problems/count-vowel-strings-in-ranges

class Solution {
public:
    vector<int> vowelStrings(vector<string>& words, vector<vector<int>>& queries) {
        
        set<char> s;
        s.insert('a');
        s.insert('e');
        s.insert('i');
        s.insert('o');
        s.insert('u');


        vector<int> arr;
        vector<int> ans;
        ans.resize(queries.size(),0);
        arr.resize(words.size(),0);
        

        for(int i=0;i<words.size();i++){
            string str=words[i];

            if(s.find(str[0])!=s.end() && s.find(str[str.size()-1])!=s.end()){
                arr[i]=1;
            }
        }

        for(int i=1;i<arr.size();i++){
            arr[i]+=arr[i-1];
        }

        for(int i=0;i<queries.size();i++){
            int first=queries[i][0];
            int second=queries[i][1];

            if(first>0){
                ans[i]=arr[second]-arr[first -1];

            }
            else
                ans[i]=arr[second];
        }

        return ans;
    }
};