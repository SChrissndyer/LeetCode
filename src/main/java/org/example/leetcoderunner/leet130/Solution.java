package org.example.leetcoderunner.leet130;

class Solution {
    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0) return;
        int m = board.length;
        int n = board[0].length;

        // go through the first column and the last column
        for (int i = 0; i < m; i++) {
            infect(board, i, 0);
            infect(board, i, n - 1);
        }

        // go through the first row and the last row
        for (int j = 1; j < n - 1; j++) {
            infect(board, 0, j);
            infect(board, m - 1, j);
        }

        // make all the remaining 'O' to 'X'
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                if (board[i][j] == '*') board[i][j] = 'O';
            }
        }
    }
    // make every 'O' that we meet to '*'
    private void infect(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return;
        if (board[i][j] == 'X' || board[i][j] == '*') return;
        board[i][j] = '*';
        infect(board, i - 1, j);
        infect(board, i + 1, j);
        infect(board, i, j - 1);
        infect(board, i, j + 1);
    }
}
