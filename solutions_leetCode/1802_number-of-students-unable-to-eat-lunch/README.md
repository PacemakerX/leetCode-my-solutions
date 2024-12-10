# Number Of Students Unable To Eat Lunch

**Question ID**: 1802  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 2 ms  
**Memory**: 41.2 MB  

## Solution Code
```java
// https://leetcode.com/problems/number-of-students-unable-to-eat-lunch

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        List<Integer> studentList = new ArrayList<>();

        List<Integer> sandwichesList = new ArrayList<>();
        
        for(int i =0;i<students.length;i++){
            studentList.add(students[i]);
            sandwichesList.add(sandwiches[i]);
        } 
        int i=0;
        while(studentList.size()>0 && i<sandwichesList.size() ){
            if(studentList.get(0)==sandwichesList.get(0)){
                studentList.remove(0);
                sandwichesList.remove(0);
                i=0;
            }
            else{
                i++;
                studentList.add(studentList.get(0));
                studentList.remove(0);
            }
        }

        return studentList.size();
    }
}
```
