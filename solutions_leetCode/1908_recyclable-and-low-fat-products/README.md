# Recyclable And Low Fat Products

**Question ID**: 1908  
**Language**: Mysql  
**Status**: Accepted  
**Runtime**: 620 ms  
**Memory**: 0B  

## Solution Code
```mysql
// https://leetcode.com/problems/recyclable-and-low-fat-products

# Write your MySQL query statement below

SELECT product_id 
FROM Products 
WHERE low_fats='Y' AND recyclable='Y';
```
