class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
      int n = arr.length;
      int[] result = new int[n];
      result[n-1]=-1;
      Stack<Integer> stk = new Stack<>();
      stk.push(arr[n-1]);
      for(int i=n-2;i>=0;i--){
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