# Maximum Beauty of an Array After Applying Operation

**Question ID**: 2779  
**Language**: C++  
**Status**: Accepted  
**Runtime**: 83 ms  
**Memory**: 105.12 MB

## Solution Code

```cpp
// https://leetcode.com/problems/maximum-beauty-of-an-array-after-applying-operation
class Solution {
public:
    int maximumBeauty(vector<int>& nums, int k) {
        sort(nums.begin(), nums.end());
        int maxBeauty = 0;

        for (int i = 0; i < nums.size(); i++) {
            // Find the farthest index where the value is within the range
            // [nums[i], nums[i] + 2*k]
            int upperBound = findUpperBound(nums, nums[i] + 2 * k);
            // Update the maximum beauty based on the current range
            maxBeauty = max(maxBeauty, upperBound - i + 1);
        }
        return maxBeauty;
    }

private:
    // Helper function to find the largest index where arr[index] <= val
    int findUpperBound(vector<int>& arr, int val) {
        int low = 0, high = arr.size() - 1, result = 0;

        // Perform binary search to find the upper bound
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= val) {
                result = mid;  // Update the result and move to the right half
                low = mid + 1;
            } else {
                high = mid - 1;  // Move to the left half
            }
        }
        return result;
    }
};

```