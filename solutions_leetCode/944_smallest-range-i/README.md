# Smallest Range I

**Question ID**: 944  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 18 ms  
**Memory**: 17.7 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/smallest-range-i


using namespace std;
class Solution {
public:
    int smallestRangeI(vector<int>& nums, int k) {

        int maxInd=0,minInd=0;

        for(int i=0;i<nums.size();i++){
            if(nums.at(i)>nums.at(maxInd))
                maxInd=i;
            if(nums.at(i)<nums.at(minInd))
                minInd=i;
        }
        
        return max(0,(nums.at(maxInd)-k)-(nums.at(minInd)+k));
    }
};
```
