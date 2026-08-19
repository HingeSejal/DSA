# Next Greater Element II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a circular integer array `nums` (i.e., the next element of `nums[nums.length - 1]` is `nums[0]`), return  *the  **next greater number**  for every element in*  `nums`.

The  **next greater number**  of a number `x` is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return `-1` for this number.

 

 **Example 1:** 

```
Input: nums = [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number. 
The second 1's next greater number needs to search circularly, which is also 2.

```

 **Example 2:** 

```
Input: nums = [1,2,3,4,3]
Output: [2,3,4,-1,4]

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 13 ms (beats 73.74%)  
**Memory:** 49.1 MB (beats 6.69%)  
**Submitted:** 2026-08-19T13:41:56.005Z  

```java
class Solution {
    public int[] nextGreaterElements(int[] arr) {
            int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=n-1;i>=0;i--){
            stk.push(arr[i]);
        }
        for(int i=n-1;i>=0;i--){
          while( stk.size()>0 && arr[i]>=stk.peek()) stk.pop();
          if(stk.size()==0) result[i]=-1;
          else result[i]=stk.peek();
          stk.push(arr[i]);
        }
        // ArrayList<Integer> ans = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     ans.add(result[i]);
        // }
        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/next-greater-element-ii/)