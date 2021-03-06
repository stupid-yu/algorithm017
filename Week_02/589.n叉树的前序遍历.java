/*
 * @lc app=leetcode.cn id=589 lang=java
 *
 * [589] N叉树的前序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new LinkedList<>();
        helper(root, list);
        return list;
    }

    public void helper(Node node, List<Integer> res) {
        if (node == null) return;

        res.add(node.val); 
        for (Node child : node.children) {
            helper(child, res);
        }
    }
}
// @lc code=end

