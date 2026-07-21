class Solution 
{
    public void dfs(int i,boolean[] vis,ArrayList<ArrayList<Integer>> adj)
    {
        vis[i]=true;
        for(int nei:adj.get(i))
        {
            if(!vis[nei])
            {
                dfs(nei,vis,adj);
            }
        }
    }
    public int countComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int edge[]:edges)
        {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean vis[]=new boolean[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                c++;
                dfs(i,vis,adj);
            }
        }
        return c;
    }
}
