import java.util.*;
// https://leetcode.com/problems/reverse-words-in-a-string

class Solution {
    public String reverseWords(String s) {
        
  s=" "+s.trim();
     int prevInd=s.length();
     StringBuilder str = new StringBuilder();
     for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)==' '){
            str.append(s.substring(i+1,prevInd));
            str.append(" ");
            while(i>=0 && s.charAt(i)==' '){
                prevInd=i;
                i--;
            }
        }
     }
     return (str.toString()).trim();

    }
}