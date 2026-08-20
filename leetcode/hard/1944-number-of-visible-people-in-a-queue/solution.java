class Solution {
    public int[] canSeePersonsCount(int[] heights) {
      int n = heights.length;
      int[] result = new int[n];
      result[n-1]=0;
      Stack<Integer> stk = new Stack<>();
      stk.push(heights[n-1]);
      for(int i=n-2;i>=0;i--){
        int count=0;
        while( stk.size()>0 && heights[i]>=stk.peek()){ 
            stk.pop();
            count++;
        }
        if(stk.size()>0) count++;
        result[i] = count;
        stk.push(heights[i]);
      }
      return result;
    }
}