#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet

class Solution {
public:
    vector<string> cellsInRange(string s) {

        char start=s[0];
        char end=s[3];

        int nstart=(s[1]-'0');
        int nend=(s[4]-'0');


        vector<string> arr;
        for(char ch=start;ch<=end;ch++){
            for(int i=nstart;i<=nend;i++){

    
                arr.push_back(ch+to_string(i));

            }
        }
        
        return arr;
    }
};