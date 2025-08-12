package Day10;

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
public class Q111_Minimum_depthOfBinaryTree {
 
    public int minDepth(TreeNode root) {
        if(root==null)
        return 0;
        int ld=minDepth(root.left);
        int rd=minDepth(root.right);
        if(ld==0)
        return 1+rd;
        if(rd==0)
        return 1+ld;
        return 1+Math.min(ld,rd);
        
    }
}