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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()){
            int qLen = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < qLen; i++){
                TreeNode node = q.poll();
                if (node != null){
                    level.add(node.val);
                    q.offer(node.left);
                    q.offer(node.right);
                }
            }
            if (!level.isEmpty()){
                res.add(level);
            }
        }
        return res;
    }
}
