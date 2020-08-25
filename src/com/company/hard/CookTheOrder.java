package com.company.hard;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CookTheOrder {
//    public int maxSatisfaction(int[] satisfaction) {
////        int[] positive=new int[satisfaction.length];
//        List<Integer> positive=new ArrayList<>();
////        int[] negative=new int[satisfaction.length];
//        List<Integer> negative=new ArrayList<>();
//        for(int i=0;i<satisfaction.length;i++){
//            if(satisfaction[i]<0){
//                int p=0;
//                if(negative.size()==0){
//                    negative.add(satisfaction[i]);
//                }else{
//                    listadd(negative,satisfaction[i],p);
//                }
//            }else {
//                int p=0;
//                if(positive.size()==0){
//                    positive.add(satisfaction[i]);
//                }else{
//                    listadd(positive,satisfaction[i],p);
//                }
//            }
//        }
//        int sum=0;
//        int add=0;
//        for(int i=0;i<positive.size();i++){
//            sum+=(i+1)*positive.get(i);
//            add+=positive.get(i);
//        }
//        for(int i=negative.size()-1;i>=0;i--){
//            if(add+negative.get(i)>0){
//                add+=negative.get(i);
//                sum+=add;
//            }else{
//                return sum;
//            }
//        }
//        return sum;
//    }
//    public void listadd(List<Integer> positive,int satisfaction,int p) {
//        for(;p<positive.size();p++){
//            if(satisfaction>=positive.get(p) && p == positive.size()-1){
//                positive.add(satisfaction);
//                break;
//            }else if(satisfaction>=positive.get(p) && satisfaction<positive.get(p+1)){
////                reset(positive,p+1);
//                positive.add(p+1,satisfaction);
//                break;
//            }else if(satisfaction<positive.get(p) &&p==0){
////                reset(positive,0);
//                positive.add(0,satisfaction);
//                break;
//            }
//        }
//    }
//    public void reset(List<Integer> arrayList,int p){
//        arrayList.add(0);
//        for(int i=arrayList.size()-2;i>=p;i--){
//            arrayList.set(i+1,arrayList.get(i));
//        }
//    }
//    public int maxSatisfaction(int[] satisfaction) {
////        int[] positive=new int[satisfaction.length];
////        int[] negative=new int[satisfaction.length];
//        List<Integer> negative=new ArrayList<>();
//        for(int i=0;i<satisfaction.length;i++){
//                int p=0;
//                if(negative.size()==0){
//                    negative.add(satisfaction[i]);
//                }else{
//                    listadd(negative,satisfaction[i],p);
//                }
//        }
//        int sum=0;
//        int add=0;
//
//        for(int i=negative.size()-1;i>=0;i--){
//            if(add+negative.get(i)>0){
//                add+=negative.get(i);
//                sum+=add;
//            }else{
//                return sum;
//            }
//        }
//        return sum;
//    }
//    public void listadd(List<Integer> positive,int satisfaction,int p) {
//        for(;p<positive.size();p++){
//            if(satisfaction>=positive.get(p) && p == positive.size()-1){
//                positive.add(satisfaction);
//                break;
//            }else if(satisfaction>=positive.get(p) && satisfaction<positive.get(p+1)){
////                reset(positive,p+1);
//                positive.add(p+1,satisfaction);
//                break;
//            }else if(satisfaction<positive.get(p) &&p==0){
////                reset(positive,0);
//                positive.add(0,satisfaction);
//                break;
//            }
//        }
//    }
//    public void reset(List<Integer> arrayList,int p){
//        arrayList.add(0);
//        for(int i=arrayList.size()-2;i>=p;i--){
//            arrayList.set(i+1,arrayList.get(i));
//        }
//    }
public int maxSatisfaction(int[] satisfaction) {
//        int[] positive=new int[satisfaction.length];
//        int[] negative=new int[satisfaction.length];
    Arrays.sort(satisfaction);
        int sum=0;
        int add=0;

        for(int i=satisfaction.length-1;i>=0;i--){
            if(add+satisfaction[i]>0){
                add+=satisfaction[i];
                sum+=add;
            }else{
                return sum;
            }
        }
        return sum;
    }
}
