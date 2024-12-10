#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/sliding-window-maximum

class Solution {
public:

    struct monotone_deque {

        deque<int> dq;

        void insert(int x){
            while(!dq.empty() && dq.back()<x)
                dq.pop_back();

            dq.push_back(x);
        }
        void remove(int x){
            if(dq.front()==x)
                dq.pop_front();
        }

        int  getMax(){
            return dq.front();
        }
    };
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        
        monotone_deque mt;

        vector<int> ans;
        for(int i=0;i<nums.size();i++){
            mt.insert(nums[i]);

            if(i-k>=0)
                mt.remove(nums[i-k]);
            if(i>=k-1)
                ans.push_back(mt.getMax());
        }

        return ans;
    }
};