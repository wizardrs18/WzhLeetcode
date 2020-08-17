package com.company.medium;

public class TheNumberOfCombatUnits1395 {
    int sum=0;
    public int numTeams(int[] rating) {
//        for(int i=0;i< rating.length;i++){
//            int num;
//            int flag=0;
//            for(int j=i+1;j< rating.length;j++){
//                num=rating[i];
//                if(rating[j]>num){
//                    flag=1;
//                }else if(rating[j]<num){
//                    flag=2;
//                }else{
//                    flag=0;
//                }
//                num=rating[j];
//                for(int k=j+1;k< rating.length;k++){
//                    if(flag==1 && rating[k]>num){
//                        sum++;
//                    }else if(flag==2 && rating[k]<num){
//                        sum++;
//                    }
//                }
//            }
//        }
//        return sum;
//    }
        for(int i=1;i< rating.length-1;i++){
                int leftsum=0;
                int rightsum=0;
                for(int left=i-1;left>=0;left--){
                    if(rating[left]>rating[i]){
                        leftsum++;
                    }
                }
                for(int right=i+1;right< rating.length;right++){
                    if(rating[right]<rating[i]){
                        rightsum++;
                    }
                }
                sum+=leftsum*rightsum;
                leftsum=0;
                rightsum=0;
                for(int left=i-1;left>=0;left--){
                    if(rating[left]<rating[i]){
                        leftsum++;
                    }
                }
                for(int right=i+1;right< rating.length;right++){
                    if(rating[right]>rating[i]){
                        rightsum++;
                    }
                }
                sum+=leftsum*rightsum;
            }
        return sum;
    }
}
