package org.example.leetcoderunner.leet130;


import java.util.Arrays;

public class Runner {
    public static void main(String[] args){
    Solution a= new Solution();

    char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
    a.solve(board );
    System.out.println(Arrays.deepToString(board));
    }
}