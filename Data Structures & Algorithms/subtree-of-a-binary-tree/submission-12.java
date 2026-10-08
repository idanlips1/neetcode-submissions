/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot != null){
            return false;
        } else if (root != null && subRoot == null){
            return true;
        } if (isSameTree(root, subRoot)){
            return true;
        } else {
            return isSubtree(root.right, subRoot) || isSubtree(root.left, subRoot);
        }
        
    }

    private boolean isSameTree(TreeNode p, TreeNode q){
        if (p == null && q == null){
            return true;
        } else if (p != null && q != null && p.val == q.val){
            return isSameTree(p.left, q.left) && isSameTree(p.right,q.right);
        } else {
            return false;
        }
    }
}
