#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/trapping-rain-water

class Solution {
public:
    int trap(vector<int>& height) {
        

        int i=0,n=height.size();
        int ans=0;

        stack<int> st;

        while(i<n){

            while(!st.empty() and height[i]>height[st.top()]){

                int t=st.top();
                st.pop();
                if(!st.empty()){
                    ans+= (i-st.top()-1)*(min(height[i],height[st.top()])-height[t]);
                }
            }
            st.push(i);
            i++;
        }
        return ans;
    }
};