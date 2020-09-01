package com.company.medium;

public class TheLargestTree654 {
    int[] nums;
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        this.nums=nums;
        int index=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        TreeNode treeNode=new TreeNode(max);
        connectTreenode(0,index,0,treeNode);
        connectTreenode(index+1, nums.length,1,treeNode);
        return treeNode;
    }
    public void connectTreenode(int first,int end,int flag,TreeNode oldTree){
        if(end<=first){return;}
        int index=0;
        int max=-1;
        for(int i=first;i<end;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        TreeNode treeNode=new TreeNode(max);
        if(flag==0){
            oldTree.left=treeNode;
        }else{
            oldTree.right=treeNode;
        }
        connectTreenode(first,index,0,treeNode);
        connectTreenode(index+1, end,1,treeNode);
    }

}
