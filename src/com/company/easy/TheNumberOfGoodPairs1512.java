package com.company.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheNumberOfGoodPairs1512 {
//    public int numIdenticalPairs(int[] nums) {
//        Map<Integer,Integer> compareNum=new HashMap<Integer,Integer>();
//        int sum=0;
//        int flag=0;
//        for(int i=0;i<nums.length;i++){
//            for(Map.Entry<Integer, Integer> entry:compareNum.entrySet()){
//                flag=0;
//                if(nums[i]==entry.getKey()){
//                    sum+=entry.getValue();
//                    flag=1;
//                    entry.setValue(entry.getValue()+1);
//                    break;
//                }
//            }
//            if(flag==0){
//                compareNum.put(nums[i],1);
//            }
//        }
//        return sum;
//    }
public int numIdenticalPairs(int[] nums) {
        int[] compareNum=new int[102];
        int sum=0;
        for(int num:nums){
                sum+=compareNum[num]++;
            }

        return sum;
    }


}
