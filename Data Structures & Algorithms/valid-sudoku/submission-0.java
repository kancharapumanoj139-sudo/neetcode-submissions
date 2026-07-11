class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char num=board[i][j];
                if(num=='.') continue;
                int boxs=(i/3)*3+(j/3);
                String row=num+"rows"+i;
                String col=num+"cols"+j;
                String box=num+"boxs"+boxs;
                if(set.contains(row)||set.contains(col)||set.contains(box))
                {
                    return false;
                }
                set.add(row);
                set.add(box);
                set.add(col);
            }
        }
        return true;
    }
}
