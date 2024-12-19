# Final Prices With a Special Discount in a Shop

**Question ID**: 1475  
**Language**: C++  
**Status**: Accepted  
**Runtime**: 0 ms
**Memory**: 13.94 MB

## Solution Code

```cpp
class Solution {
public:
    vector<int> finalPrices(vector<int>& prices) {



        for(int i=0;i<prices.size();i++){
            for(int j=i+1;j<prices.size();j++){
                if(prices[j]<=prices[i]){
                    prices[i]-=prices[j];
                    break;
                }
            }
        }


        return prices;
    }
};
//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop
```
