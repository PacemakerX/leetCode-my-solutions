import java.util.*;
// https://leetcode.com/problems/reverse-integer

class Solution {
    public int reverse(int x) {

        int temp=x;
        if(x<0)
            temp*=-1;
        int newX=0;
        while(temp>0){
            
            if(newX>(Integer.MAX_VALUE-temp%10)/10)
            return 0;
            newX = newX*10+temp%10;
            temp=temp/10;
        }

        return x<0?newX*-1:newX;
    }
}