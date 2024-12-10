# Big Countries

**Question ID**: 595  
**Language**: Mysql  
**Status**: Accepted  
**Runtime**: 275 ms  
**Memory**: 0B  

## Solution Code
```mysql
// https://leetcode.com/problems/big-countries

# Write your MySQL query statement below
SELECT name,population ,area
FROM WORLD
WHERE population>=25000000 OR area>=3000000;
```
