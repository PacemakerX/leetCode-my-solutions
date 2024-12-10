import java.util.*;
// https://leetcode.com/problems/robot-return-to-origin

class Solution {
    public boolean judgeCircle(String moves) {
        
     int countV = 0, countH = 0;
        for (char ch : moves.toCharArray()) {
             if (ch == 'U')
                countV++;
            else if (ch == 'D')
                countV--;
            else if (ch == 'R')
                countH++;
            else if (ch == 'L')
                countH--;
        }
        return (countH == 0) && (countV == 0);
    }
}