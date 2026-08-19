# Next Greater Element in Circular Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a circular integer array  **arr[]**, the task is to determine the next greater element  **(NGE)**  for each element in the array.

The next greater element of an element  **arr[i]**  is the first element that is greater than  **arr[i]**  when traversing circularly. If no such element exists, return  **-1**  for that position.

 **Note:** Since the array is circular, after reaching the last element, the search continues from the beginning until we have looked at all elements once.

 **Examples:** 

```
Input: arr[] = [1, 3, 2, 4]
Output: [3, 4, 4, -1]
Explanation:
The next greater element for 1 is 3.
The next greater element for 3 is 4.
The next greater element for 2 is 4.
The next greater element for 4 does not exist, so return -1.
```

```
Input: arr[] = [0, 2, 3, 1, 1]
Output: [2, 3, -1, 2, 2]
Explanation:
The next greater element for 0 is 2.
The next greater element for 2 is 3.
The next greater element for 3 does not exist, so return -1.
The next greater element for 1 is 2 (from circular traversal).
The next greater element for 1 is 2 (from circular traversal).
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T13:40:27.055Z  

```java
class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
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
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(result[i]);
        }
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/next-greater-element/1)