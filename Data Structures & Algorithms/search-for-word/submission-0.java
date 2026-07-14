class Solution {
    public boolean find(int i,int j,char[][] board,String word,int k)
    {
        if(k==word.length())
        {
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || word.charAt(k)!=board[i][j])
        {
            return false;
        }
        char temp=board[i][j];
        board[i][j]='.';
        boolean ans=find(i-1,j,board,word,k+1)||
                    find(i,j+1,board,word,k+1)||
                    find(i+1,j,board,word,k+1)||
                    find(i,j-1,board,word,k+1);
        board[i][j]=temp;
        return ans;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(find(i,j,board,word,0))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
