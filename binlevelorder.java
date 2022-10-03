class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            int qlen = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < qlen; i++) {
                TreeNode node = q.remove();
                if (node != null) {
                    level.add(node.val);
                    q.add(node.left);
                    q.add(node.right);
                }

            }
            if (level.size() > 0) {
                result.add(level);
            }
        }
        return result;
    }
}