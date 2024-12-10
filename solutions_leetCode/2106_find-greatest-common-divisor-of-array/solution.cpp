#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/find-greatest-common-divisor-of-array

class Solution {
public:
    int findGCD(vector<int>& nums) {

        int minNum=1001,maxNum=0;

        for(int i=0;i<nums.size();i++){
            minNum=min(minNum,nums.at(i));
            maxNum=max(maxNum,nums.at(i));
        }
        
        return calculate(minNum,maxNum);
    }

    int calculate(int a,int b){

        while(b>0){
            int temp;
            temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
};