import java.util.*;
// https://leetcode.com/problems/calculate-money-in-leetcode-bank

class Solution {
    public int totalMoney(int n) {
               int sum=0;
        for(int i=0,j=1;i<n;i++,j++){
            if(i%7==0)
            j=i/7+1;
            sum+=j;
        }
        return sum;
    } 
    }