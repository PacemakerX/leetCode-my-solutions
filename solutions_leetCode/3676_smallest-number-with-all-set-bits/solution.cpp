#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/smallest-number-with-all-set-bits

class Solution {
public:
    int smallestNumber(int n) {

        
    int ans=1;
        while(ans<=n)
            ans=ans*2;

        return ans-1;
    }
};