# Number Of Laser Beams In A Bank

**Question ID**: 2244  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 15 ms  
**Memory**: 45.4 MB  

## Solution Code
```java
// https://leetcode.com/problems/number-of-laser-beams-in-a-bank

class Solution {
    public int numberOfBeams(String[] bank) {
        
     int i = 0;
        int count1 = 0, count2 = 0, mainCount = 0;
        while (i < bank.length-1 && count1 == 0) {
            count1 = numOfOnes(bank, i);
            if (count1 != 0) {

                while (i < bank.length - 1 && count2 == 0) {
                    count2 = numOfOnes(bank, i + 1);
                    i++;

                }
                mainCount += count1 * count2;
                count1 = 0;
                count2 = 0;
            }
            else
            i++;
        }
        return mainCount;

    }

    public static int numOfOnes(String[] bank, int i) {
        int count = 0;
        if (i < bank.length) {
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1')
                    count++;

            }
        }
        return count;
    }
}
```
