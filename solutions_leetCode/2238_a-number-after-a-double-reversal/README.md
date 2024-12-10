# A Number After A Double Reversal

**Question ID**: 2238  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 0 ms  
**Memory**: 40.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/a-number-after-a-double-reversal

class Solution {
    public boolean isSameAfterReversals(int num){
        
    int temp=num;
        int newNum=0;
        while(temp>0){
            newNum=newNum*10+temp%10;
            temp=temp/10;
        }
        
        temp=newNum;
        newNum=0;
        while(temp>0){
            newNum=newNum*10+temp%10;
            temp=temp/10;
        }
        return num==newNum;
    }
}
```
