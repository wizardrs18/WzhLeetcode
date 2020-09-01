package com.company.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserGrouping1282 {
//    public List<List<Integer>> groupThePeople(int[] groupSizes) {
//        List<ArrayList<Integer>> list=new ArrayList<>();
//        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
//        for(int i=0;i< groupSizes.length;i++){
//            if(!map.containsKey(groupSizes[i])){
//                ArrayList<Integer> arrayList=new ArrayList<>();
//                arrayList.add(i);
//                map.put(groupSizes[i],arrayList);
//            }else{
//                map.get(groupSizes[i]).add(i);
//            }
//        }
//
//
//    }
//}
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        boolean[] isVisited = new boolean[groupSizes.length];
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (!isVisited[i])
                collect(ans, isVisited, groupSizes, i);
        }
        return ans;
    }

    public void collect(List<List<Integer>> ans, boolean[] isVisited, int[] groupSizes, int i) {
        List<Integer> list = new ArrayList<>();
        int size = groupSizes[i--];
        while (list.size() < size && ++i < groupSizes.length) {
            if (groupSizes[i] == size && !isVisited[i]) {
                isVisited[i] = true;
                list.add(i);
            }
        }
        ans.add(list);
    }
}

