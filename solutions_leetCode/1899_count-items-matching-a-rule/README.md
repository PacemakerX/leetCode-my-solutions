# Count Items Matching A Rule

**Question ID**: 1899  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 4 ms  
**Memory**: 50.6 MB  

## Solution Code
```java
// https://leetcode.com/problems/count-items-matching-a-rule

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
         int toCompare = 0;
        int count = 0;
        switch (ruleKey) {
            case "type":
                toCompare = 0;
                break;
            case "color":
                toCompare = 1;
                break;
            case "name":
                toCompare = 2;
                break;
        }
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).get(toCompare).equals(ruleValue))
                count++;
        }
        return count; 
    }
}
```
