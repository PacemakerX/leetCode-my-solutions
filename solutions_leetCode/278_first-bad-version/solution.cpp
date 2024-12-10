#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/first-bad-version

// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int first=1;
        int last =n;
        int mid=0;
        while(first<last){
            mid=first+(last-first)/2;
            if(isBadVersion(mid))
            last=mid;
            else
            first=mid+1;
        }
       return first; 


    }
};