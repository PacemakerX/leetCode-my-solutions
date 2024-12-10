#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/kth-largest-element-in-a-stream

class KthLargest {
public:

    multiset<int> mSet;
    int _k;
    KthLargest(int k, vector<int>& nums) {
       mSet.clear();
        _k=k;
        for(auto i : nums)
            mSet.insert(i);

        while(mSet.size()>k){
            mSet.erase(mSet.begin());
        }

    }
    
    int add(int val) {

        mSet.insert(val);

        while(mSet.size()>_k){
            mSet.erase(mSet.begin());
        }
        return  *mSet.begin();
        
    }
};

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest* obj = new KthLargest(k, nums);
 * int param_1 = obj->add(val);
 */