# Defanging An Ip Address

**Question ID**: 1205  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 1 ms  
**Memory**: 41.5 MB  

## Solution Code
```java
// https://leetcode.com/problems/defanging-an-ip-address

class Solution {
    public String defangIPaddr(String address) {
     String newAdd=address.replaceAll("\\.", "[.]");
    return newAdd;       
    }
}
```
