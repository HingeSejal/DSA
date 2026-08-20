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