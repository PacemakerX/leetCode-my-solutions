import java.util.*;
// https://leetcode.com/problems/unique-morse-code-words

class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> map = new HashSet<String>();
        StringBuilder str= new StringBuilder();
        for(String word : words){
            str.delete(0,str.length());
            for(int i =0;i<word.length();i++){

                str.append(morse[(int)word.charAt(i) -97]);

            }
            map.add(str.toString());
        }
        
        return map.size();
    }
}