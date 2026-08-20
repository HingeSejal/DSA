# The Celebrity Problem

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A celebrity is a person who is known to all but  **does not know**  anyone at a party. A party is being organized by some people. A square matrix  **mat[][]** of size n*n is used to represent people at the party such that if an element of row **i** and column **j** is **set to 1**  it means  **ith person knows jth person**. You need to return the  **index** of the **celebrity**  in the party, if the celebrity does not exist, return  **-1**.

 **Note:**  Follow  **0-based** indexing.

 **Examples:** 

```
Input: mat[][] = [[1, 1, 0],
                [0, 1, 0],
                [0, 1, 1]]
Output: 1
Explanation: 0th and 2nd person both know 1st person and 1st person does not know anyone. Therefore, 1 is the celebrity person.
```

```
Input: mat[][] = [[1, 1], 
                [1, 1]]
Output: -1
Explanation: Since both the people at the party know each other. Hence none of them is a celebrity person.
```

```
Input: mat[][] = [[1]]
Output: 0
```

 **Constraints:** 
1 ≤ mat.size() ≤ 1000
0 ≤ mat[i][j] ≤ 1
mat[i][i] = 1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-20T09:59:13.043Z  

```java
class Solution {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while (st.size() > 1) {
             int a = st.pop();
             int b = st.pop();

             if (mat[a][b] == 1) {
                 // a knows b -> a cannot be celebrity
                 st.push(b);
             } else {
                 // a doesn't know b -> b cannot be celebrity
                 st.push(a);
             }
         }
        if(st.size()==0)return -1;
        int celeb = st.pop();
        for(int j=0;j<n;j++){
            if(j==celeb) continue;
            if (mat[celeb][j] == 1 || mat[j][celeb] == 0) return -1;
        }
        return celeb;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1)