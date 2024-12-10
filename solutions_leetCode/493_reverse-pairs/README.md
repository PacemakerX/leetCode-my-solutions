# Reverse Pairs

**Question ID**: 493  
**Language**: Java  
**Status**: Accepted  
**Runtime**: 82 ms  
**Memory**: 54.7 MB  

## Solution Code
```java
// https://leetcode.com/problems/reverse-pairs

class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
        
    }

    public int mergeSort(int [] nums,int begin, int end){
        int count=0;
        if(begin>=end)
            return count;
        int mid=begin+(end-begin)/2;
        count+=mergeSort(nums,begin,mid);
        count+=mergeSort(nums,mid+1,end);
        count+=countPairs(nums,begin,mid,end);
        merge(nums,begin,mid,end);
        return count;
    }

    public void merge(int[] nums,int begin,int mid,int end){

        ArrayList<Integer> ls = new ArrayList<>();

        int low=begin;
        int high=mid+1;

        while(low<=mid && high<=end){
            if(nums[low]<nums[high])
                ls.add(nums[low++]);
            else
                ls.add(nums[high++]);

        }

        while(low<=mid){
            ls.add(nums[low++]);
        }

        while(high<=end){
            ls.add(nums[high++]);
        }

        for(int i = begin;i<=end;i++)
            nums[i]=ls.get(i-begin);
    }


    public int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] >(long) 2 * arr[right]) right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }
}
```
