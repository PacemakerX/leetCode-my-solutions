import java.util.*;
// https://leetcode.com/problems/determine-if-string-halves-are-alike

class Solution {
    public boolean halvesAreAlike(String s) {
         s = s.toLowerCase();
        int countA = 0, countB = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u')
                countA++;
            if (s.charAt(s.length() - 1 - i) == 'a' || s.charAt(s.length() - 1 - i) == 'e' || s.charAt(s.length() - 1 - i) == 'i' || s.charAt(s.length() - 1 - i) == 'o'
                    || s.charAt(s.length() - 1 - i) == 'u')
                countB++;

        }
        return countA == countB; 
    }
}