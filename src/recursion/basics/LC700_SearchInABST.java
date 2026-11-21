package recursion.basics;

// Pattern: Binary Search Tree Traversal (Reference Navigation)
// Complexity: Time O(h) [O(log n) balanced, O(n) skewed] | Space O(h) [Call Stack Depth]
// Key Insight: Root acts as a moving cursor; follow .left for smaller targets and .right for larger targets
public class LC700_SearchInABST {

    // Definition for a binary tree node (matches LeetCode's TreeNode)
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        // Construct sample BST: [4, 2, 7, 1, 3]
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7)
        );

        TreeNode result1 = searchBST(root, 2);
        System.out.println(result1 != null ? result1.val : "null"); // Expected: 2

        TreeNode result2 = searchBST(root, 5);
        System.out.println(result2 != null ? result2.val : "null"); // Expected: null
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        // Base Case: Reached an empty leaf pointer or found the target node
        if (root == null || root.val == val) {
            return root;
        }

        // Recursive Step: Navigate left or right based on BST ordering
        if (val < root.val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }
}