#include <bits/stdc++.h>
using namespace std;

//https://leetcode.com/problems/two-sum-ii---input-array-is-sorted

class Solution
{
public:

    vector<int> twoSum(vector<int> &numbers, int target)
    {

        vector<int> ans(2);
        
        int low=0,high=numbers.size()-1;

        while(low<high){
            int sum=numbers[low]+numbers[high];
            if(sum==target)
                return {++low,++high};
            else if(sum>target){
                high--;
            }else
                low++;
        }

        return {0,0};
    }
};