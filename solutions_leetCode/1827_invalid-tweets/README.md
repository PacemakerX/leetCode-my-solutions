# Invalid Tweets

**Question ID**: 1827  
**Language**: Mysql  
**Status**: Accepted  
**Runtime**: 730 ms  
**Memory**: 0B  

## Solution Code
```mysql
// https://leetcode.com/problems/invalid-tweets

# Write your MySQL query statement below
SELECT tweet_id
FROM Tweets
WHERE LENGTH(content)>15;
```
