import java.util.*;
// https://leetcode.com/problems/harshad-number

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {

        int temp=x;

        int num=0;

        while(temp>0){
            num+=temp%10;
            temp=temp/10;
        }

        if(x%num==0)
            return num;
        
        return -1;
        
    }
}