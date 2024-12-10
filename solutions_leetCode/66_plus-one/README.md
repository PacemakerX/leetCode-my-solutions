# Plus One

**Question ID**: 66  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 41 MB  

## Solution Code
```java
// https://leetcode.com/problems/plus-one

class Solution {
    public int[] plusOne(int[] digits) {
                if (digits[digits.length - 1] != 9) {

            digits[digits.length - 1] += 1;
            return digits;
        }
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i >=0; i--) {
            if(i==0 && digits[i]==10){
                digits[i]%=10;
                int [] digitsA =Arrays.copyOfRange(digits,0,digits.length+1);
                digitsA[0]=1;
                return digitsA;
            }
            if(digits[i]>9 ){
                digits[i]%=10;
                digits[i-1]+=1;
            }

        }
        return digits;

    }
}
```
