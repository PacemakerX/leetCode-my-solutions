# Find Resultant Array After Removing Anagrams

**Question ID**: 1353  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 4 ms  
**Memory**: 44.3 MB  

## Solution Code
```java
// https://leetcode.com/problems/find-resultant-array-after-removing-anagrams

class Solution {
    public boolean anagrams(String s1, String s2) {
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
    
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (!anagrams(words[i], words[i - 1])) {
                res.add(words[i]);
            }
        }
        return res;
    }
}
```
