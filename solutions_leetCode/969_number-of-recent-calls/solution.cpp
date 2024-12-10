#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/number-of-recent-calls

class RecentCounter {
public:

    deque<int> dq;
    RecentCounter() {
        dq.clear();
    }
    
    int ping(int t) {

        dq.push_back(t);
        while(dq.front()<t-3000){
            dq.pop_front();
        }

        return dq.size();
        
    }
};

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter* obj = new RecentCounter();
 * int param_1 = obj->ping(t);
 */