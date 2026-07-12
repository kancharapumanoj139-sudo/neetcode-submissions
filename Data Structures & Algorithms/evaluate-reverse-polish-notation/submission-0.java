class Solution {
    public int evalRPN(String[] tokens) {
        int ans=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            String ch=tokens[i];
            if(ch.equals("+"))
            {
                int a=st.pop();
                int b=st.pop();
                int sum=a+b;
                st.push(sum);
            }
            else if(ch.equals("-"))
            {
                int a=st.pop();
                int b=st.pop();
                int sub=b-a;
                st.push(sub);
            }
            else if(ch.equals("*"))
            {
                int a=st.pop();
                int b=st.pop();
                int pr=a*b;
                st.push(pr);
            }
            else if(ch.equals("/"))
            {
                int a=st.pop();
                int b=st.pop();
                int div=b/a;
                st.push(div);
            }
            else
            {
                st.push(Integer.parseInt(ch));
            }
        }
        return st.pop();
    }
}
