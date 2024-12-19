# Max Chunks To Make Sorted

**Question ID**: 769  
**Language**: C++  
**Status**: Accepted  
**Runtime**: 0 ms
**Memory**: 9.24 MB

## Solution Code

```cpp
//https://leetcode.com/problems/max-chunks-to-make-sorted
class Solution {
public:
    int maxChunksToSorted(vector<int>& arr) {

        stack <int> st;

        for(int i=0;i<arr.size();i++){

        if(st.empty() || arr[i]>st.top()){
            st.push(arr[i]);
        }else{
            int top=st.top();

            while(!st.empty() && st.top()>arr[i]){
                st.pop();
            }

            st.push(top);
        }
        }
        return st.size();

    }
};
```
