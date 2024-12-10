import java.util.*;
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