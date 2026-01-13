class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        String s1=preOrder(p);
        String s2=preOrder(q);

        return s1.equals(s2) ? true:false;
    }
    public String preOrder(TreeNode node){
        if(node==null) return "null";

        StringBuilder sb=new StringBuilder();
        sb.append(node.val);
        sb.append(preOrder(node.left));
        sb.append(preOrder(node.right));

        return sb.toString();
    }
    
}
