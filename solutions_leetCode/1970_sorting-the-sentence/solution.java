import java.util.*;
// https://leetcode.com/problems/sorting-the-sentence

class Solution {
    public String sortSentence(String s) {
          String[] str = s.split(" ");
        String[] newStr = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            newStr[Character.getNumericValue((str[i].charAt(str[i].length() - 1))) - 1] = str[i].substring(0,
                    (str[i].length() - 1));

        }
        StringBuilder str2 = new StringBuilder();
        for (String string : newStr) {
            str2.append(string);
            if (string != newStr[newStr.length - 1])
                str2.append(" ");
        }
        return str2.toString();
    }
}