# Valid Palindrome Ii

**Question ID**: 680  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 4 ms  
**Memory**: 45 MB  

## Solution Code
```java
// https://leetcode.com/problems/valid-palindrome-ii

class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
        }
        return true;
    }
    public boolean isPalindrome(String s, int i, int j){
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
```
