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
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> resultList = new ArrayList<>();
        preorder(root, resultList);

        return resultList;
    }

    private void preorder(TreeNode root, List<Integer> resultList) {
        if (root == null) return;

        resultList.add(root.val);
        preorder(root.left, resultList);
        preorder(root.right, resultList);
    }
}