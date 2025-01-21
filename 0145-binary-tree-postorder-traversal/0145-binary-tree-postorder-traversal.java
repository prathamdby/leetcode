/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> resultList = new ArrayList<>();
        postorder(root, resultList);

        return resultList;
    }

    private void postorder(TreeNode root, List<Integer> resultList) {
        if (root == null) return;

        postorder(root.left, resultList);
        postorder(root.right, resultList);
        resultList.add(root.val);
    }
}