class Solution {
    public int calPoints(String[] operations) {
        int ans=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            String ch=operations[i];
            if(ch.equals("+"))
            {
                int a=st.pop();
                int b=st.pop();
                int sum=a+b;
                st.push(b);
                st.push(a);
                st.push(sum);
            }
            else if(ch.equals("C"))
            {
                st.pop();
            }
            else if(ch.equals("D"))
            {
                int t=st.peek();
                st.push(2*t);
            }
            else
            {
                st.push(Integer.parseInt(ch));
            }
        }
        while(!st.isEmpty()){
            ans+=st.peek();
            st.pop();
        }
        return ans;
    }
}