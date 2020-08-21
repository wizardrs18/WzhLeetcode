package com.company.hard;

import com.company.medium.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class RestoreTheBinaryTreeFromSequentialTraversal1028 {
    public TreeNode recoverFromPreorder(String S) {
//        List<ArrayList<Integer>> treeList= new ArrayList<>();
//        int index=0;
//        for(int i=0;i<S.length();i++){
//            if(S.charAt(i)=='-'){
//                index++;
//            }else {
//                int j=i;
//                String num="";
//                while(S.charAt(j)!='-'){
//                    num+=S.charAt(j);
//                    j++;
//                }
//                if(treeList.get(index)==null){
//                    ArrayList<Integer> integers = new ArrayList<>();
//                    treeList.add(index,integers);
//                }
//                treeList.get(index).add(Integer.valueOf(num));
//            }
//        }
//
            List<TreeNode> treeList=new ArrayList<>();
            int index=0;
            String num="";
            for(int i=0;i<S.length();i++){
                if(S.charAt(i)=='-'){
                    index++;
                }else {
                    int j=i;
                    num="";
                    while(j<S.length()&&S.charAt(j)!='-'){
                        num+=S.charAt(j);
                        j++;
                    }
                    TreeNode treeNode=new TreeNode(Integer.valueOf(num));
                    if(index>0){
                        if(treeList.get(index-1).left==null){
                            treeList.get(index-1).left=treeNode;
                        }else{
                            treeList.get(index-1).right=treeNode;
                        }
                        treeList.add(index,treeNode);
                        index=0;
                    }else {
                        treeList.add(treeNode);
                        index=0;
                    }
                }
            }
            return treeList.get(0);
    }
}
/**
 * 无敌解法：
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//    public TreeNode recoverFromPreorder(String S) {
//
//        Deque<TreeNode> path = new LinkedList<>();
//        int pos = 0;
//
//        while(pos< S.length()){
//
//            int level = 0;
//            while(S.charAt(pos) =='-'){
//                //- 的个数 -> 层数
//                ++level;
//                ++pos;
//            }
//
//            //取到值
//            int value = 0;
//            while(pos< S.length()&&Character.isDigit(S.charAt(pos))){
//                value = value*10 + (S.charAt(pos)-'0');
//                ++pos;
//            }
//
//            //构造节点
//            TreeNode node  = new TreeNode(value);
//            //如果当前节点的深度==当前路径长度（前一个节点是当前节点的父节点）
//            if(level == path.size()){
//                //如果不是第一个节点，前一个节点的左子节点为当前节点
//                if(!path.isEmpty()){
//                    path.peek().left = node;
//                }
//            }else {
//                //如果当前节点的深度！=当前路径长度（前一个节点不是当前节点的父节点）
//                while(level!=path.size()){
//                    //通过queue弹出其他子节点，找到当前节点的父节点
//                    path.pop();
//                }
//                // 找到父节点，因为此时左子节点已确定，所以赋值给右子节点
//                path.peek().right = node;
//            }
//            // 放入queue中
//            path.push(node);
//
//
//
//        }
//        // 全部弹出，只剩根节点
//        while(path.size()>1) path.pop();
//        // 返回根
//        return path.peek();
//    }
//}
