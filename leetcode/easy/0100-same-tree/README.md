# Same Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the roots of two binary trees `p` and `q`, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

 

 **Example 1:** 

```
Input: p = [1,2,3], q = [1,2,3]
Output: true

```

 **Example 2:** 

```
Input: p = [1,2], q = [1,null,2]
Output: false

```

 **Example 3:** 

```
Input: p = [1,2,1], q = [1,1,2]
Output: false

```

 

 **Constraints:** 

- The number of nodes in both trees is in the range [0, 100].
- -104 <= Node.val <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.8 MB (beats 71.70%)  
**Submitted:** 2026-08-25T14:31:24.601Z  

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode r1, TreeNode r2) {
        if(r1==null && r2==null) return true;
          if(r1==null || r2==null) return false;
          if(r1.val != r2.val) return false;
        //   if(!isSame(r1.left, r2.left)) return false;
        //   if(!isSame(r1.right, r2.right)) return false;
          return isSameTree(r1.left, r2.left) && isSameTree(r1.right, r2.right) ;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/same-tree/)