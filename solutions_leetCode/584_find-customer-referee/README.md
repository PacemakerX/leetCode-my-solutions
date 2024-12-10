# Find Customer Referee

**Question ID**: 584  
**Language**: Mysql  
**Status**: Accepted  
**Runtime**: 519 ms  
**Memory**: 0B  

## Solution Code
```mysql
// https://leetcode.com/problems/find-customer-referee

# Write your MySQL query statement below
SELECT name 
FROM Customer
WHERE referee_id IS NULL OR referee_id!=2;
```
