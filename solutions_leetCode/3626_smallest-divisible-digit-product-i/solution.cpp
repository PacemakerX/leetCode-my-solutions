#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/smallest-divisible-digit-product-i

class Solution {
public:


    bool check(int a,int b){
        int rem=1;

        while(a>0){
            rem*=a%10;
            a=a/10;
        }

        return (rem%b==0);
    }
    int smallestNumber(int n, int t) {

        for(int i=n;i<INT_MAX;i++){
            if(check(i,t))
                return i;
        }

        return 0;
    }
};