# Largest Rectangle In Histogram

**Question ID**: 84  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 98 ms  
**Memory**: 79.9 MB  

## Solution Code
```cpp
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
```
