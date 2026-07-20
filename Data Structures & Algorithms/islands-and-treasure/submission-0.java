class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==0)
                {
                    q.offer(new int[]{i,j});
                }
            }
        }
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        while(!q.isEmpty())
        {
            int[] ele=q.poll();
            int r=ele[0];
            int c=ele[1];
            for(int i=0;i<4;i++)
            {
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]==Integer.MAX_VALUE)
                {
                    grid[nr][nc]=grid[r][c]+1;
                    q.offer(new int[]{nr,nc});
                }
            }
        }
    }
}
