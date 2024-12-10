# Maximum Area Of Longest Diagonal Rectangle

**Question ID**: 3251  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 10 ms  
**Memory**: 29.2 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle

class Solution {
public:

    double getDiagonal(int a,int b){

        return sqrt( a*a+b*b);
    }
    int areaOfMaxDiagonal(vector<vector<int>>& dimensions) {


        double diagonal =0;

        int maxArea=0;
        for(int i=0;i<dimensions.size();i++){

        double temp=getDiagonal(dimensions[i][0],dimensions[i][1]);
            if(temp>diagonal){
                maxArea=dimensions[i][0]*dimensions[i][1];
                diagonal=temp;
            }else if(temp==diagonal){
                maxArea=max(maxArea,dimensions[i][0]*dimensions[i][1]);
            }
        }

        return maxArea;
        
    }
};
```
