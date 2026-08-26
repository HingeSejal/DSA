# Symmetric Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the  **root**  of a binary tree, check whether it is  **symmetric**, i.e., whether the tree is a  **mirror image of itself**.

 **Note:**  A binary tree is symmetric if the left subtree is a mirror reflection of the right subtree.

 **Examples:** 

```
Input: root = [10, 5, 5, 2, N, N, 2] 
   
Output: True
Explanation: As the left and right half of the above tree is mirror image, the tree is symmetric.

```

```
Input: root = [8, 4, 4, N, 6, N, 6]
   
Output: False
Explanation:  As the left and right half of the above tree is not the mirror image, the tree is not symmetric. 
```

 **Constraints:** 
0 ≤ number of nodes ≤ 2000
1 ≤ node->data ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T14:16:52.710Z  

```java
/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean isSymmetric(Node root) {
         mirror(root.left);
         return isIdentical(root.left,root.right);
     }
     boolean isIdentical(Node p, Node q){
         if(p==null && q==null) return true;
         if(p==null || q==null) return false;
         if(p.data != q.data) return false;
         return isIdentical(p.left,q.left) && isIdentical(p.right,q.right);
     }
     void mirror(Node root){
         if(root==null) return ;
         Node temp = root.left;
         root.left = root.right;
         root.right = temp;
         mirror(root.left);
         mirror(root.right);
     }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/symmetric-tree/1)