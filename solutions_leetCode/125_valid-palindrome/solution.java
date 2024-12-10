import java.util.*;
// https://leetcode.com/problems/valid-palindrome

class Solution {
    public boolean isPalindrome(String s) {
         int value = 0;
        String str = (s.replaceAll(" ", "")).toLowerCase();
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            value = (int) str.charAt(i);
            if ((value > 47 && value < 58) || (value < 123 && value > 96))
                newStr.append(str.charAt(i));

        }
        int start = 0, end = newStr.length() - 1;
        while (start < newStr.length() / 2) {
            if (newStr.charAt(start) == newStr.charAt(end)) {
                start++;
                end--;
            } else
                return false;
        }
        return true;
    }
}