#include <bits/stdc++.h>
using namespace std;

//https://leetcode.com/problems/target-sum
class Solution {
public:
    int targetNum, n,cnt = 0;
    vector<int> arr;

    int findTargetSumWays(vector<int>& nums, int target) {
        targetNum = target;
        arr = nums;
        n = nums.size();
        findCount(0, 0);  
        return cnt;
    }

    void findCount(int targetIndex, int sum) {
        if (targetIndex == n) {
            if (sum == targetNum)
                cnt++;
            return;
        }

       
        findCount(targetIndex + 1, sum + arr[targetIndex]);
        findCount(targetIndex + 1, sum - arr[targetIndex]);
    }
};

