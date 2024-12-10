import java.util.*;
// https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent

class Solution {
     public boolean checkAlmostEquivalent(String word1, String word2) {
            boolean bool1=true,bool2=true;
        for (int i = 0; i < word1.length(); i++) {
            if (Math.abs(ferequency(word1, word1.charAt(i)) - ferequency(word2, word1.charAt(i))) > 3)
                bool1=false;

        }
        for (int i = 0; i < word2.length(); i++) {
            if (Math.abs(ferequency(word1, word2.charAt(i)) - ferequency(word2, word2.charAt(i))) > 3)
                bool2=false;

        }
        return bool1 && bool2;
    }

    public int ferequency(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                count++;

        }
        return count;
    }
}