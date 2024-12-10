#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/find-the-n-th-value-after-k-seconds

class Solution {
public:
    #define mod 1000000007
    int valueAfterKSeconds(int n, int k) {
        
        long long arr[n];
        
        fill(arr,arr+n,1);
        
        while(k--){
            for(int i=1;i<n;i++){
                arr[i]= ((arr[i-1]%mod)+(arr[i]%mod))%mod;
            }
        }
        return arr[n-1];
        
    }
};