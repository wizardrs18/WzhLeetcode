package com.company.medium;

public class TheSumOfTheDeepestLeafNodes1302 {
    int sum=0;
    int max=0;
    public int deepestLeavesSum(TreeNode root) {
        deepSum(root,0);
        return sum;
    }

    private void deepSum(TreeNode root, int level) {
        level++;
        if(level>max){
            max=level;
            sum= root.val;
        }else if(level==max){
            sum+= root.val;
        }
        if(root.left!=null){
            deepSum(root.left,level);
        }
        if(root.right!=null){
            deepSum(root.right,level);
        }

    }
}
