# Add Strings

**Question ID**: 415  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 12 ms  
**Memory**: 45.4 MB  

## Solution Code
```java
// https://leetcode.com/problems/add-strings

class Solution {
    public String addStrings(String num1, String num2) {

        if(num1.length()>num2.length())
            num2=paddString(num2,num1.length()-num2.length());
        else if(num1.length()<num2.length())
                num1=paddString(num1,num2.length()-num1.length());

        String result ="";
        int carry=0;

        for(int i=num2.length()-1;i>=0;i--){
            int number =(num1.charAt(i) -'0') +(num2.charAt(i)-'0') +carry;
            result= number%10 +result;
            carry=number/10;
        }
        if(carry==1)
            result=carry+result;
        
        return result;
        
    }

    public String paddString(String str, int k){
        while(k> 0){
            str=0+str;
            k--;
        }
        return str;
    }
}
```
