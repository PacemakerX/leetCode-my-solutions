# 4sum

**Question ID**: 18  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 17 ms  
**Memory**: 43.9 MB  

## Solution Code
```java
// https://leetcode.com/problems/4sum

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ls = new ArrayList<>();

        Arrays.sort(nums);

        

        for(int i=0;i<nums.length;i++){
        
            if(i>0 && nums[i]==nums[i-1])
                continue;
            for(int j=i+1;j<nums.length;j++){

                if(j>i+1 && nums[j]==nums[j-1])
                    continue;

                int k=j+1;
                int l=nums.length-1;

                while(k<l){
                long sum=(long)nums[i]+(long)nums[j]+(long)nums[k]+(long)nums[l];
                    if(sum==target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);

                        ls.add(temp);

                        k++;
                        l--;

                        while(k<l && nums[k]==nums[k-1])
                            k++;
                        while(k<l && nums[l]==nums[l+1])
                            l--;
                    }
                    else if(sum<target)
                        k++;
                    else
                        l--;
                
                }
            }
        }   
        return ls;
    }
}
```
