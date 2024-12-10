# Article Views I

**Question ID**: 1258  
**Language**: Mysql  
**Status**: Accepted  
**Runtime**: 417 ms  
**Memory**: 0B  

## Solution Code
```mysql
// https://leetcode.com/problems/article-views-i

# Write your MySQL query statement below

SELECT DISTINCT(author_id)as id
FROM Views
WHERE author_id=viewer_id
ORDER BY author_id
```
