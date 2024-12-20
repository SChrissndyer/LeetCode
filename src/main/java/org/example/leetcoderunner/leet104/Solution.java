package org.example.leetcoderunner.leet104;



   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        if( l ==0 && r==0 ) return 1;
        else if ( l>= r) return l +1;
        else return r+1;

    }
}