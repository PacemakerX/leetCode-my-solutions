# Baseball Game

**Question ID**: 682  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 41.6 MB  

## Solution Code
```java
// https://leetcode.com/problems/baseball-game

class Solution {
    public int calPoints(String[] operations) {

        List<Integer> ls = new ArrayList<>();
        int sum=0;
        for(String str : operations){
            if(str.equals("C")){
            
                ls.remove(ls.size()-1);
            }
            else if(str.equals("D")){
               
                ls.add(ls.get(ls.size()-1)*2);
            }
                
            else if(str.equals("+")){
                ls.add(ls.get(ls.size()-1)+ls.get(ls.size()-2));
            
            }
            else{
                ls.add(Integer.parseInt(str));
            
            }
        }
            for(int i=0;i<ls.size();i++){
                sum+=ls.get(i);
            }

        

        return sum;
    
    }
}
```
