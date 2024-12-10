#include <bits/stdc++.h>
using namespace std;
// https://leetcode.com/problems/largest-rectangle-in-histogram

class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        

        int ans=0;

        stack<int> st;

        int i=0;
        while(i<heights.size()){

            if(st.empty()|| heights[i]>=heights[st.top()]){
                st.push(i);
                i++;
            }else{
                    int t=st.top();
                    st.pop();

                if(st.empty()){
                    ans=max(ans,i*heights[t]);
                }else{
                    ans=max(ans, heights[t]*(i-st.top()-1));
                }
            }

        }

        while(!st.empty()){
             int t=st.top();
                    st.pop();

                if(st.empty()){
                    ans=max(ans,i*heights[t]);
                }else{
                    ans=max(ans, heights[t]*(i-st.top()-1));
                }
        }

        return ans;
    }
};