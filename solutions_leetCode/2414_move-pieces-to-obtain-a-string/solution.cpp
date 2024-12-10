#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/move-pieces-to-obtain-a-string

class Solution {
public:
    bool canChange(string start, string target) {


        if(start==target)
            return true;

        int i=0,j=0;

        while(i<start.size() || j<target.size()){

            while(i<start.size() && start[i]=='_')
                i++;
            
            while(j<target.size() && target[j]=='_')
                j++;

            
            if(start[i]!=target[j] || (start[i]=='L' && j>i) || start[i]=='R' && i>j)
                return false;

                i++;
                j++;
            }

        return true;
    }
};