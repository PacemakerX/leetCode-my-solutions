# Unique Number Of Occurrences

**Question ID**: 1319  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 42.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/unique-number-of-occurrences

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
            Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each value in the array
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Check if the counts are unique using a HashSet
        Set<Integer> occurrencesSet = new HashSet<>(countMap.values());

        // If the sizes are the same, counts are unique; otherwise, they are not
        return occurrencesSet.size() == countMap.size();
    }

    
}
```
