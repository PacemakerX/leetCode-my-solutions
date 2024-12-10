# Sender With Largest Word Count

**Question ID**: 2378  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 52 ms  
**Memory**: 49.5 MB  

## Solution Code
```java
// https://leetcode.com/problems/sender-with-largest-word-count

class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<messages.length;i++){

            map.put(senders[i],map.getOrDefault(senders[i], 0)+getWords(messages[i]));
        }

        int max=0;
        for( int wordCount: map.values()){
            max=Math.max(max,wordCount);
        }

        Arrays.sort(senders);

        for(int i=senders.length-1;i>=0;i--){
            if(map.get(senders[i])==max)
                return senders[i];
        }
        return "";
    }

    public int getWords(String str){

        int count=0;

        for(int i=0;i<str.length();i++)
            if(str.charAt(i)==' ')
                count++;

        return count+1;
    }
}
```
