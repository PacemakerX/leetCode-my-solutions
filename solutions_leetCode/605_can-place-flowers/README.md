# Can Place Flowers

**Question ID**: 605  
**Language**: Cpp  
**Status**: Accepted  
**Runtime**: 11 ms  
**Memory**: 22.9 MB  

## Solution Code
```cpp
// https://leetcode.com/problems/can-place-flowers

class Solution {
public:
   bool canPlaceFlowers(vector<int> &flowerbed, int n)
{
    int count = 0;
    for (int i = 0; i < flowerbed.size(); i++)
    {
        if (flowerbed[i] == 0)
        {

            bool emptyLeftPlot = (i == 0) || (flowerbed[i - 1] == 0);
            bool emptyRightPlot = (i == flowerbed.size() - 1) || (flowerbed[i + 1] == 0);

            if (emptyLeftPlot && emptyRightPlot)
            {
                flowerbed[i] = 1;
                count++;
            }
        }
    }
    return count >= n;
}
};
```
