import java.util.*;
// https://leetcode.com/problems/first-unique-character-in-a-string

class Solution {
    public int firstUniqChar(String s) {


        List<Character> ls = new ArrayList<>();

        int count=0;
        for(int i=0;i<s.length();i++){
            count=0;
            if(ls.contains(s.charAt(i)))
                continue;
            for (int j = i+1; j < s.length(); j++) {

                if(s.charAt(i)==s.charAt(j)){
                    ls.add(s.charAt(i));
                    count++;
                    break;
                }
                
                 }
                 if(count==0)
                 return i;           
       

        }
        return -1;
        
    }
}