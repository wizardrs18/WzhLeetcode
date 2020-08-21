package com.company.hard;

import com.company.medium.TreeNode;

import java.util.ArrayList;
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
                    index=0;
                    index++;
                }else {
                    int j=i;
                    num="";
                    while(j<S.length()&&S.charAt(j)!='-'){
                        num+=S.charAt(j);
                        j++;
                    }
                }
                TreeNode treeNode=new TreeNode(Integer.valueOf(num));
                if(index>0){
                    if(treeList.get(index-1).left==null){
                        treeList.get(index-1).left=treeNode;
                    }else{
                        treeList.get(index-1).right=treeNode;
                    }
                    treeList.add(index,treeNode);
                }else {
                    treeList.add(treeNode);
                }
            }
            return treeList.get(0);
        }
}
