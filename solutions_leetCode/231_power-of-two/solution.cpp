#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/power-of-two

class Solution {
public:
    bool isPowerOfTwo(int n) {

        while(n>2 || n<-2){
            if(n%2==1 )
                return false;
            n=n>>1;
        }
        if(n<0)
            return false;
        return (bool)n;
    }
};