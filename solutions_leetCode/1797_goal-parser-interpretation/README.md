# Goal Parser Interpretation

**Question ID**: 1797  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 41.6 MB  

## Solution Code
```java
// https://leetcode.com/problems/goal-parser-interpretation

class Solution {
    public String interpret(String command) {
           StringBuilder str = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G')
                str.append("G");
            else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                str.append("o");
                i += 1;
            } else {
                str.append("al");
                i += 3;
            }

        }
        return str.toString();
    }
}
```