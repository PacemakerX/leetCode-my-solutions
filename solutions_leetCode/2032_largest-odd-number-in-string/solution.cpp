#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/largest-odd-number-in-string

class Solution {
public:
    string largestOddNumber(string num) {

        if(num.back()%2)
            return num;
        
        int i=num.length()-1;

        while(i>=0){
            if(num[i] % 2 == 1)
                return num.substr(0,i+1);
            i--;
        }

        return "";
    }
};