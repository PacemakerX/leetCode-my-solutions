# Find The Sum Of Encrypted Integers

**Question ID**: 3367  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 42.3 MB  

## Solution Code
```java
// https://leetcode.com/problems/find-the-sum-of-encrypted-integers

class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        
        int sum=0;

        for(int i : nums)
            sum+=findMax(i);

        return sum;
    }

    public int findMax(int a){
        int max=0;

        int temp1=a,newNum=0;
        

        while(temp1>0){
            max=Math.max(max,temp1%10);
            temp1/=10;
        }

        while(a>0){
                newNum=newNum*10+max;
                a=a/10;
        }

        return newNum;
    }
}
```
