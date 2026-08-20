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