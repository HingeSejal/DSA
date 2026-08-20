# Stock Span Problem

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

The stock span problem is a financial problem where we have a series of daily price quotes for a stock and we need to calculate the span of stock price for all days.

Given an array  **arr[]**  representing daily stock prices, the stock span for the  **i-th**  day is the number of consecutive days up to day i (including day i itself) for which the price of the stock is  **less than or equal**  to the price on day  **i**. Return the span of stock prices for each day in the given sequence.

 **Examples:** 

```
Input: arr[] = [100, 80, 90, 120]
Output: [1, 1, 2, 4]
Explanation: Consider each day one by one:
Day 1 (100): Span = 1.
Day 2 (80): Span = 1 because the previous price (100) is greater than 80.
Day 3 (90): Span = 2 because 80 ≤ 90, but 100 > 90.
Day 4 (120): Span = 4 because 100, 80, and 90 are all less than or equal to 120.
Hence, the output is [1, 1, 2, 4].

```

```
Input: arr[] = [10, 4, 5, 90, 120, 80]
Output: [1, 1, 2, 4, 5, 1]
Explanation: Consider each day one by one:
Day 1 (10): Span = 1.
Day 2 (4): Span = 1 because the previous price (10) is greater than 4.
Day 3 (5): Span = 2 because 4 ≤ 5, but 10 > 5.
Day 4 (90): Span = 4 because 10, 4, and 5 are all less than or equal to 90.
Day 5 (120): Span = 5 because all previous prices are less than or equal to 120.
Day 6 (80): Span = 1 because the previous price (120) is greater than 80.
Hence, the output is [1, 1, 2, 4, 5, 1].
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-20T06:36:34.104Z  

```java
class Solution {
    public class Pair{
        int number;
        int index;
        Pair(int number, int index) {
        this.number = number;
        this.index = index;
        }
    }
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        int[] pgn = new int[n];
        pgn[0]=1;
        Stack<Pair> stk = new Stack<>();
        stk.push(new Pair(arr[0],0));
       for(int i=1;i<n ;i++){
           while(stk.size()>0 && stk.peek().number<=arr[i]) stk.pop();
           if(stk.size()==0) pgn[i]=i-(-1);
           else pgn[i]= i-stk.peek().index;
           stk.push(new Pair(arr[i],i));
       }
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            result.add(pgn[i]);
        }
    
     return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1)