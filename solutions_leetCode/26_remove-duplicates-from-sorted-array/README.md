# Remove Duplicates From Sorted Array

**Question ID**: 26  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 43.6 MB  

## Solution Code
```java
// https://leetcode.com/problems/remove-duplicates-from-sorted-array

class Solution {
    public int removeDuplicates(int[] arr) {
         int check = arr[0], k = 0, count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != check) {
                arr[i-k]=arr[i];
                check = arr[i];
                count++;
            } else {
                k++;
            }

        }
        return count;
    }
}
```
