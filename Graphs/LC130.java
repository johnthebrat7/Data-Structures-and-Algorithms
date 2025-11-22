
class Pair {
    int r, c;
    Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}

class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;
        int m = board.length, n = board[0].length;

        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                board[i][0] = '#';
                q.offer(new Pair(i, 0));
            }
            if (board[i][n - 1] == 'O') {
                board[i][n - 1] = '#';
                q.offer(new Pair(i, n - 1));
            }
        }
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                board[0][j] = '#';
                q.offer(new Pair(0, j));
            }
            if (board[m - 1][j] == 'O') {
                board[m - 1][j] = '#';
                q.offer(new Pair(m - 1, j));
            }
        }

        int[][] dis = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int r = p.r, c = p.c;

            for (int[] d : dis) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nr < m && nc >= 0 && nc < n && board[nr][nc] == 'O') {
                    board[nr][nc] = '#';
                    q.offer(new Pair(nr, nc));
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == '#') board[i][j] = 'O';
            }
        }
    }
}
