# Count Prefix And Suffix Pairs I

**Question ID**: 3309  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 3 ms  
**Memory**: 44.1 MB  

## Solution Code
```java
// https://leetcode.com/problems/count-prefix-and-suffix-pairs-i

class Solution {
    public int countPrefixSuffixPairs(String[] words) {

        int count=0;
        for(int i=0;i<words.length;i++){
            
            for(int j=i+1;j<words.length;j++){

                if(isPrefixAndSuffix(words[i],words[j]))
                    count++;
            }
        }

        return count;
        
    }

    public boolean isPrefixAndSuffix(String str1,String str2){

        if(str2.length()>=str1.length())
        return (str1.equals(str2.substring(0,str1.length())) && str1.equals(str2.substring(str2.length()-str1.length(),str2.length())));

        else
        return false;
    }
}
```
