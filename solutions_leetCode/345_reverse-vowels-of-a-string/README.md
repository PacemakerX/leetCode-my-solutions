# Reverse Vowels Of A String

**Question ID**: 345  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 5 ms  
**Memory**: 44.6 MB  

## Solution Code
```java
// https://leetcode.com/problems/reverse-vowels-of-a-string

class Solution {
    public String reverseVowels(String s) {

        StringBuilder str= new StringBuilder(s);
        StringBuilder vowels= new StringBuilder();
        char ch='a';
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U')
                            vowels.append(ch);
        }   
        
        vowels=vowels.reverse();
        int j=0;

         for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U')
                str.setCharAt(i,vowels.charAt(j++));
        }   

        return str.toString();
    }
}
```
