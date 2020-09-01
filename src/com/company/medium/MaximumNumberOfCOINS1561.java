package com.company.medium;

import java.util.Arrays;

public class MaximumNumberOfCOINS1561 {
    public int maxCoins(int[] piles) {
        int sum=0;
//        int n= piles.length/3;
//        for(int i=0;i<n;i++){
//            int max=0;
//            int indexMax=0;
//            int sec=0;
//            int indexSec=0;
//            for(int j=0;j< piles.length;j++) {
//                if (piles[j] > max) {
//                    max = piles[j];
//                    indexMax = j;
//                }
//            }
//            for(int j=0;j< piles.length;j++) {
//                if(piles[j]<=max && piles[j]>sec && j!=indexMax){
//                    sec=piles[j];
//                    indexSec=j;
//                }
//            }
//            sum+=sec;
//            piles[indexMax]=0;
//            piles[indexSec]=0;
//        }
//        return sum;
        Arrays.sort(piles);
        for(int i=0;i< piles.length/3;i++){
            sum+=piles[piles.length-2-i*2];
        }
        return sum;
    }
}
