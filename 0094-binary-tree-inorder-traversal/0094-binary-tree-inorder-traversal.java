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
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> resultList = new ArrayList<>();
        inorder(root, resultList);

        return resultList;
    }

    private void inorder(TreeNode root, List<Integer> resultList) {
        if (root == null) return;

        inorder(root.left, resultList);
        resultList.add(root.val);
        inorder(root.right, resultList);
    }
}