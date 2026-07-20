class Solution {

    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};

    public void solve(char[][] board) {

        int n = board.length;
        int m = board[0].length;

        // First and Last Column
        for (int i = 0; i < n; i++) {

            if (board[i][0] == 'O')
                dfs(i, 0, board);

            if (board[i][m - 1] == 'O')
                dfs(i, m - 1, board);
        }

        // First and Last Row
        for (int j = 0; j < m; j++) {

            if (board[0][j] == 'O')
                dfs(0, j, board);

            if (board[n - 1][j] == 'O')
                dfs(n - 1, j, board);
        }

        // Convert remaining O -> X and T -> O
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (board[i][j] == 'O')
                    board[i][j] = 'X';

                else if (board[i][j] == 'T')
                    board[i][j] = 'O';
            }
        }
    }

    void dfs(int r, int c, char[][] board) {

        board[r][c] = 'T';   // Mark as safe

        for (int i = 0; i < 4; i++) {

            int nr = r + dr[i];
            int nc = c + dc[i];

            if (nr >= 0 && nr < board.length &&
                nc >= 0 && nc < board[0].length &&
                board[nr][nc] == 'O') {

                dfs(nr, nc, board);
            }
        }
    }
}