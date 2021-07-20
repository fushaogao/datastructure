package com.data.demo;

import com.data.model.TreeNode;

public class TreeDemo {
    public static  void main(String[] args){
        TreeDemo treeDemo = new TreeDemo();
        TreeNode left = new TreeNode(null,null,1);
        TreeNode right = new TreeNode(null,null,3);
        TreeNode root = new TreeNode(left,right,2);

        System.out.print(treeDemo.minDepth(root));
    }

    /**
     * 根节点到子节点的最小距离
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = minDepth(root.getLeft());
        int right = minDepth(root.getRight());
        if (left == 0 || right == 0){
            return left + right + 1;
        }
        return Math.min(left, right) + 1;
    }
}
