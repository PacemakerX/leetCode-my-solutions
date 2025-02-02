import java.util.*;
// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping

class Solution {
    public String freqAlphabets(String s) {
         String alpha = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder mappedString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                mappedString.append(alpha.charAt(Integer.valueOf(s.substring(i, i + 2)) - 1));
                i += 2;
            } else
                mappedString.append(alpha.charAt(Character.getNumericValue(s.charAt(i) - 1)));

        }
        return mappedString.toString();
    }
}