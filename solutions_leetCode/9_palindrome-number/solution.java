import java.util.*;
// https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
        int temp=x, rev=0;
        while(temp>0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        return rev==x?true:false;
    }
}