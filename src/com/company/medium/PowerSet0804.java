package com.company.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSet0804 {
    List<List<Integer>> list=new ArrayList<>();
    int[] nums;
    int length;
    public List<List<Integer>> subsets(int[] nums) {
        this.length=nums.length;
        List<Integer> listSon=new ArrayList<>(1);
        this.nums=nums;
        list.add(listSon);
        CopyList(0);
        return list;
    }

    private void CopyList(int index) {
        int length=list.size();
        for(int i=0;i<length;i++){
            List<Integer> listSon= new ArrayList<>();
            for(int j=0;j<list.get(i).size();j++){
                listSon.add(list.get(i).get(j));
            }
            listSon.add(nums[index]);
            list.add(listSon);
        }
        if(index<nums.length-1){
            CopyList(++index);
        }
    }
}
