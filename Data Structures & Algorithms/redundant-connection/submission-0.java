class Solution {

    boolean dfs(int src, int dest, boolean[] vis,
                ArrayList<ArrayList<Integer>> adj) {

        if (src == dest)
            return true;

        vis[src] = true;

        for (int nei : adj.get(src)) {

            if (!vis[nei]) {

                if (dfs(nei, dest, vis, adj))
                    return true;
            }
        }

        return false;
    }

    public int[] findRedundantConnection(int[][] edges) {

        int n = edges.length;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            boolean[] vis = new boolean[n + 1];

            if (dfs(u, v, vis, adj)) {
                return edge;
            }

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        return new int[0];
    }
}