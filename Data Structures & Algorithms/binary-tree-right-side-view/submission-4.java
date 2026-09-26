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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int qLen = q.size();
            int rightSide = 0;
            for (int i = 0; i < qLen; i++){
                TreeNode node = q.poll();
                if (node != null){
                    rightSide = node.val;
                    q.offer(node.left);
                    q.offer(node.right);
                }
            }
            if (rightSide != 0){
                res.add(rightSide);
            }
        }
        return res;
    }
}
