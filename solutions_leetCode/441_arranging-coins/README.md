# Arranging Coins

**Question ID**: 441  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 41.1 MB  

## Solution Code
```java
// https://leetcode.com/problems/arranging-coins

class Solution {
    public int arrangeCoins(int n) {

    int start=1,end=n,mid=0;

    while(start<=end){
    mid=start+(end-start)/2;

    if((long)mid*(mid+1)/2>n)
        end=mid-1;
    else
    start=mid+1;
        
    }
    return end;
}}
```
