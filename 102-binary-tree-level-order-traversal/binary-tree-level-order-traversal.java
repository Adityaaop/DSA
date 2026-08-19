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
        if(root == null) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0) {
            int size = q.size();
            List<Integer> currLevel = new ArrayList<>();
            for(int i = 1; i <= size; i++) {
                TreeNode currVtx = q.remove();
                currLevel.add(currVtx.val);
                if(currVtx.left != null) {
                    q.add(currVtx.left);
                }
                if(currVtx.right != null) {
                    q.add(currVtx.right);
                }
            }
            ans.add(currLevel);
        }
        return ans;
    }
}
