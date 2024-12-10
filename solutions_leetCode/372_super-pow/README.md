# Super Pow

**Question ID**: 372  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 30 ms  
**Memory**: 44.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/super-pow

import java.math.BigInteger;

class Solution {
    public int superPow(int a, int[] b) {
      StringBuilder str=new StringBuilder();
      for(int i=0; i<b.length; i++)
      {
        str.append(Integer.toString(b[i]));
      }
      String st=str.toString();
      BigInteger exponent=new BigInteger(st);
      BigInteger base=BigInteger.valueOf(a);
      BigInteger ans=base.modPow(exponent, BigInteger.valueOf(1337));
      return ans.intValue();
    }
}
```
