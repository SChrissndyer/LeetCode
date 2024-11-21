package org.example.leetcoderunner.leet104;

public class Runner {
    public static void main(String[] args){
    Solution a= new Solution();

    TreeNode b= new TreeNode(1,new TreeNode(1), new TreeNode(1,new TreeNode(2),new TreeNode(3)));
    System.out.println(a.maxDepth(b));
    }
}