#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/snake-in-matrix

class Solution {
public:
    int finalPositionOfSnake(int n, vector<string>& commands) {

        int pos=0;
        int j=0,k=0;
       for(int i=0;i<commands.size();i++){

        if(commands[i]=="UP")
            j--;
        else if(commands[i]=="DOWN")
            j++;
        else if(commands[i]=="RIGHT")
            k++;
        else 
            k--;

       } 
        pos+= (j*n)+k ;

       return pos;
    }
};