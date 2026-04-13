class Solution {
    private List<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        performPreorderDFS(root);
        return result;
    }


    private void performPreorderDFS(TreeNode node) {
        if (node == null) {
            return;
        }
    
        result.add(node.val);
        performPreorderDFS(node.left);
        performPreorderDFS(node.right);
    }
}