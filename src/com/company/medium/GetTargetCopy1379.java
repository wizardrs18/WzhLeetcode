package com.company.medium;


import java.util.ArrayList;
import java.util.List;

public class GetTargetCopy1379 {
    TreeNode result;
    TreeNode target;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target=target;
        mapper(cloned);
        return result;
    }
    public void mapper(TreeNode origin){
        if(origin.val==target.val){
            result=origin;
        }else{
            if(origin.left!=null){
                mapper(origin.left);
            }
            if(origin.right!=null){
                mapper(origin.right);
            }
        }

    }
}
