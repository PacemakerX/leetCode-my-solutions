import java.util.*;
// https://leetcode.com/problems/powx-n

class Solution {
    public double myPow(double x, int n) {

        double ans = 1.0;
        long nn = n;
        if(n<0) nn=nn*-1;

        while (nn>0){
            if(nn%2==1){
                ans =ans*x;
                nn=nn-1;
            }
            else{
                x=x*x;
                nn/=2;
            }
        }
        if(n<0) ans = (double)(1.0)/(double)(ans);
        return ans;
        
    }
}