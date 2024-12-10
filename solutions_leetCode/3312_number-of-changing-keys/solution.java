import java.util.*;
// https://leetcode.com/problems/number-of-changing-keys


class Solution {
    public int countKeyChanges(String s) {

        // count variable to count the different characters
        int count = 0;

        /* converting string into lower case because small and capital letters are same*/
        s = s.toLowerCase();

        for(int i = 1; i<s.length(); i++)
        {
            /* if there is different character occures, The count value will increase by 1  */
            if(s.charAt(i-1) != s.charAt(i))
            {
                count++;
            }
        }
        return count;
    }
}