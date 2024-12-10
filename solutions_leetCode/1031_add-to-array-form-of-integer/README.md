# Add To Array Form Of Integer

**Question ID**: 1031  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 55 ms  
**Memory**: 45.8 MB  

## Solution Code
```java
// https://leetcode.com/problems/add-to-array-form-of-integer

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        List<Integer> ls = new ArrayList<>();
        int i = num.length - 1, count = 0;
        while (i >= 0 && k > 0) {
            ls.addFirst((num[i] + k % 10 + count) % 10);
            count = (num[i] + k % 10 + count) / 10;
            i--;
            k /= 10;

        }
        while (i >= 0) {
            ls.addFirst((num[i] + count) % 10);
            count = (num[i] + count) / 10;
            i--;
        }
        k = k + count;
        while (k > 0) {
            ls.addFirst(k % 10);
            k = k / 10;
        }

        return ls;
    }
}
```
