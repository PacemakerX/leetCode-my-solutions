# Sum of Squares of Special Elements

**Question ID**: 2778  
**Language**: C++  
**Status**: Accepted  
**Runtime**: 0 ms
**Memory**: 40.07 MB

## Solution Code

```cpp
//https://leetcode.com/problems/sum-of-squares-of-special-elements
class Solution {
public:
    int sumOfSquares(vector<int>& nums) {

        int sum=0;

        int n=nums.size();
        for(int i=0;i<nums.size();i++){
            if(n%(i+1)==0){

                sum+= (nums[i]*nums[i]);
            }
        }

        return sum;
    }
};
```
