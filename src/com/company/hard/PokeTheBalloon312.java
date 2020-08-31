package com.company.hard;

import javax.security.auth.login.CredentialNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PokeTheBalloon312 {

//    PokeTheBalloon312List<Integer> list=new ArrayList<>();
//    public int maxCoins(int[] nums) {
//        if(nums.length==0){return 0;}
//        int min;
//        int index;
//        if(nums.length>3){
//            min=nums[1];
//            index=1;
//        for(int i=1;i<nums.length-1;i++){
//            if(min>nums[i]){
//                min=nums[i];
//                index=i;
//            }
//        }
//        sum+=poke(index,nums);
//        }else if(nums.length==3){
//            sum+=poke(1,nums);
//            index=1;
//        }else if(nums.length==2){
//            if(nums[0]<nums[1]){
//                index=0;
//                sum+=poke(0,nums);
//            }else{
//                index=1;
//                sum+=poke(1,nums);
//            }
//        }else{
//            sum+=poke(0,nums);
//            index=0;
//        }
//        int[] newArray = new int[nums.length-1];// 新数组，长度为原始数组减去 1
//        for(int i=0;i<newArray.length; i++) {
//            if (index < 0 || index >= nums.length) {
//                return sum;
//            }
//            if(i<index) {
//                newArray[i] = nums[i];
//            }
//            else {
//                newArray[i] = nums[i+1];
//            }
//        }
//        if(newArray.length>0){
//            maxCoins(newArray);
//        }
//        return sum;
//    }
//
//    int max=0;
//    private int poke(int index, List<Integer> list) {
//        if(index==0 && list.size()==1){
//            return list.get(index);
//        }else if(index==0){
//            return list.get(index)*list.get(index+1);
//        }else if(index==list.size()-1){
//            return list.get(index)*list.get(index-1);
//        }
//        return list.get(index)*list.get(index-1)*list.get(index+1);
//    }
//    public  int maxCoins(int[] nums){
//        ArrayList<Integer> list=new ArrayList<>();
//        for(int i=0;i<nums.length;i++){
//            list.add(nums[i]);
//        }
//        int sum=0;
//        maxCoinsCon(list,sum);
//        return max;
//    }
//    public void maxCoinsCon(ArrayList<Integer> list,int sum) {
//        if (list.size() == 1) {
//            max=Math.max(max,sum+list.get(0));
//            return ;
//        }
//        for(int i=0;i<list.size();i++){
//            int numsum=sum+poke(i,list);
//            ArrayList<Integer> listcopy= (ArrayList<Integer>)list.clone();
//            listcopy.remove(i);
//            maxCoinsCon(listcopy,numsum);
//        }
//        return ;
//    }
public int maxCoins(int[] nums) {
    int n = nums.length;
    int[][] rec = new int[n + 2][n + 2];
    int[] val = new int[n + 2];
    val[0] = val[n + 1] = 1;
    for (int i = 1; i <= n; i++) {
        val[i] = nums[i - 1];
    }
    for (int i = n - 1; i >= 0; i--) {
        for (int j = i + 2; j <= n + 1; j++) {
            for (int k = i + 1; k < j; k++) {
                int sum = val[i] * val[k] * val[j];
                sum += rec[i][k] + rec[k][j];
                rec[i][j] = Math.max(rec[i][j], sum);
            }
        }
    }
    return rec[0][n + 1];
}
}
