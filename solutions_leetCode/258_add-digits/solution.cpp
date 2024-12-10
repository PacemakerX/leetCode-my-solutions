#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/add-digits

class Solution {
public:
    int addDigits(int num) {
        
        while(num>9){
            int temp=0;
        while(num>0){
            temp+=num%10;
            num/=10;
        }
        num=temp;
        }

        return num;
    }
};