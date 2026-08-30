# Contains Duplicate II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums` and an integer `k`, return `true`  *if there are two  **distinct indices*** `i` *and* `j` *in the array such that* `nums[i] == nums[j]` *and* `abs(i - j) <= k`.

 

 **Example 1:** 

```
Input: nums = [1,2,3,1], k = 3
Output: true

```

 **Example 2:** 

```
Input: nums = [1,0,1,1], k = 1
Output: true

```

 **Example 3:** 

```
Input: nums = [1,2,3,1,2,3], k = 2
Output: false

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109
- 0 <= k <= 105

## Solution

**Language:** Java  
**Runtime:** 39 ms (beats 5.14%)  
**Memory:** 125 MB (beats 6.77%)  
**Submitted:** 2026-08-30T19:37:00.673Z  

```java
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> lastIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (lastIndex.containsKey(num) && i - lastIndex.get(num) <= k) {
                return true;
            }
            lastIndex.put(num, i); 
        }

        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/contains-duplicate-ii/)