class TreeNode {
 int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Q1_Leetcode_236{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: found null or one of the nodes
        if (root == null || root == p || root == q) {
            return root;
        }

        // Search in left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both sides return a node, root is the LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return the non-null side
        return (left != null) ? left : right;
    }
}