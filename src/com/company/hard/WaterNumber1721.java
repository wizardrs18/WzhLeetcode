package com.company.hard;

public class WaterNumber1721 {
//    public int trap(int[] height) {
//        int sum=0;
//        for(int i=0;i<height.length;i++){
//            int now=height[i];
//            int left=height[i];
//            int right=height[i];
//            for(int j=i;j>=0;j--){
//                if(height[j]>left){
//                    left=height[j];
//                }
//            }
//            if(left!=height[i]){
//                for(int j=i;j<height.length;j++) {
//                    if (height[j] > right) {
//                        right = height[j];
//                    }
//                }
//                int temp=Math.min(right,left);
//                if (temp > now) {
//                    sum+=temp-now;
//                }
//            }
//        }
//        return sum;
//    }
    public int trap(int[] height) {
        int[] right=new int[height.length];
        int leftM=0;
        int[] left=new int[height.length];
        int rightM=0;
        int sum=0;
        for(int i=0;i<height.length;i++){
            leftM=Math.max(leftM,height[i]);
            left[i]=leftM;
        }
        for(int i=height.length-1;i>=0;i--){
            rightM=Math.max(rightM,height[i]);
            right[i]=rightM;
        }
        for(int i=0;i<height.length;i++){
            int temp=Math.min(right[i],left[i]);
            if(temp>height[i]){
                sum+=temp-height[i];
            }
        }
        return sum;
    }
}
