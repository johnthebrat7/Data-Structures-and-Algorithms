class Solution {
    public boolean ans=false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String s1=pre(root);
        String s2=pre(subRoot);
        if(root.left==null && root.right==null && subRoot.left==null && subRoot.right==null){
            return root.val==subRoot.val ? true:false;
        }
        return s1.contains(s2) ? true:false;

    }
    public String pre(TreeNode node){
        if(node==null) return "null";
        StringBuilder sb=new StringBuilder("");
        sb.append(node.val);
        sb.append(pre(node.left));
        sb.append(pre(node.right));

        return sb.toString();


    }
    
}
