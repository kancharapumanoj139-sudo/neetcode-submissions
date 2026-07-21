class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int in[]=new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
    adj.add(new ArrayList<>());
}
        for(int pre[]:prerequisites)
        {
            adj.get(pre[1]).add(pre[0]);
            in[pre[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(in[i]==0)
            {
                q.offer(i);
            }
        }
        int[] ans = new int[numCourses];
        int c=0,i=0;
        while(!q.isEmpty())
        {
            int node=q.poll();
            c++;
            ans[i++]=node;
            for(int nei:adj.get(node))
            {
                in[nei]--;
                if(in[nei]==0) q.offer(nei);
            }
        }
        if(c==numCourses) return ans;
        return new int[0];
    }
}
