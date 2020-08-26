package com.company.hard;

import com.company.medium.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class OrderTraversAlfter145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Deque<TreeNode> deque=new ArrayDeque<>();
        TreeNode root2;
        if(root!=null){
            deque.push(root);
            while(deque.size()!=0){
                if(root.left!=null){
                    deque.push(root);
                    root2=root;
                    root=root.left;
                    root2.left=null;
                }else if(root.right!=null){
                    deque.push(root);
                    root2=root;
                    root=root.right;
                    root2.right=null;
                }else {
                    list.add(root.val);
                    root=deque.pop();
                }
            }
        }
        return list;
    }
}
