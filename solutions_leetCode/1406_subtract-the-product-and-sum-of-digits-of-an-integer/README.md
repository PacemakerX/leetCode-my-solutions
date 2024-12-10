# Subtract The Product And Sum Of Digits Of An Integer

**Question ID**: 1406  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 40.7 MB  

## Solution Code
```java
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer

class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,product=1;
        while(n>0){
            sum+=n%10;
            product*=n%10;
            n/=10;
        }        
        return product-sum;
    }
}
```
