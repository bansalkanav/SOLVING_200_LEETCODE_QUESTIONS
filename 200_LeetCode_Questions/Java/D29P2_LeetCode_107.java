# Java code coming soon

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       List<List<Integer>> ans = new LinkedList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> res = new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                res.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            ans.add(0,res);
        }
        return ans;
    }
}
