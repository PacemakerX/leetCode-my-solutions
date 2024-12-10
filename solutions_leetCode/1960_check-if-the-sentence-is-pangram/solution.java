import java.util.*;
// https://leetcode.com/problems/check-if-the-sentence-is-pangram

class Solution {
    public boolean checkIfPangram(String sentence) {
        for (int i = 97; i < 123; i++) {
            if (sentence.indexOf((char) i) == -1)
                return false;

        }
        return true; 
    }
}