# Compare Strings By Frequency Of The Smallest Character

**Question ID**: 1273  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1336 ms  
**Memory**: 45.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character

class Solution {
    public  int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] frequency = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (smallestFrequenc(queries[i]) < smallestFrequenc(words[j]))
                    frequency[i]++;

            }
        }
        return frequency;

    }

    public  int smallestFrequenc(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        int count=0;
        for (int i = 0; i < ch.length; i++) {
            if ( ch[i] == ch[0])
                count++;

        }
        return count;
    }
}
```
