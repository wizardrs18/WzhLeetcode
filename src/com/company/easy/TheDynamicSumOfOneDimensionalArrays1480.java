package com.company.easy;

/**
 * @name: 1480. 一维数组的动态和
 * @author: wzh
 */
public class TheDynamicSumOfOneDimensionalArrays1480 {
//    public int[] runningSum(int[] nums) {
//        int[] sum = new int[nums.length];
//        sum[0]=nums[0];
//        for(int i=1;i<nums.length;i++){
//           sum[i]=sum[i-1]+nums[i];
//        }
//        return sum;
//    }
public int[] runningSum(int[] nums) {
    for(int i=1;i<nums.length;i++){
        nums[i]=nums[i-1]+nums[i];
    }
    return nums;
}
}
