# Find Common Characters

**Question ID**: 1044  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 12 ms  
**Memory**: 45.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/find-common-characters

class Solution {
    public List<String> commonChars(String[] words) {

        List<String> ls = new ArrayList<>();
        for(int i=0;i<words[0].length();i++){
            boolean contains=true;
        
            for(int j=1;j<words.length;j++){

                if(!words[j].contains(""+words[0].charAt(i))){
                    contains=false;
                    break;
                }
                else{
                        StringBuilder str= new StringBuilder(words[j]);
                    str.deleteCharAt(words[j].indexOf(words[0].charAt(i)));
                    words[j]=str.toString();
                }
            }
            if(contains )
                ls.add(""+words[0].charAt(i));

        }

        return ls;
        
    }
}
```
