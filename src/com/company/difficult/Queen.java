package com.company.difficult;

import java.util.ArrayList;
import java.util.List;

public class Queen {
    int sum=0;
    int n;
    public int totalNQueens(int n) {
        List<Boolean> banrow=new ArrayList<Boolean>();
        int[] site=new int[n];
        int name=0;
        this.n=n;
        for(int i=0;i<n;i++){
            banrow.add(i,true);
        }
        for(int i=0;i<Math.floor((float)n/2);i++){
            List banrownew =new ArrayList<Boolean>();
            for(int j=0;j<n;j++){
                banrownew.add(j,banrow.get(j));
            }
            banrownew.set(i,false);
            site[i]=name;
            soloQueen(banrownew,site,name);
        }
        sum=sum*2;
            if(n%2==1){
                if(n>2) {
                    banrow.set(n/2 , false);
                    site[n/2+1]=name;
                    int[] sitemid=new int[n];
                    soloQueen(banrow,sitemid,name);
                }else{
                    sum++;
                }
            }
        return sum;
    }
    public void soloQueen(List<Boolean> banrow,int[] site,int name){
        name++;
        boolean[] bannew=new boolean[n];
        for(int i=0;i<n;i++){
            bannew[i]=banrow.get(i);
        }
        if(name==n-1){
            for(int j=0;j<n;j++) {
                if(!banrow.get(j)) {
                    if (j - (name-site[j]) >= 0) {
                        bannew[j - (name-site[j])] = false;
                    }
                    if (j + (name-site[j]) < n) {
                        bannew[j + (name-site[j])] = false;
                    }
                }
            }
            for(int i=0;i<n;i++){
                if(bannew[i]){
                    sum++;
                }
            }
        } else {
                for(int j=0;j<n;j++) {
                    if(!banrow.get(j)) {
                        if (j - (name-site[j]) >= 0) {
                            bannew[j - (name-site[j])] = false;
                        }
                        if (j + (name-site[j]) < n) {
                            bannew[j + (name-site[j])] = false;
                        }
                    }
                }
                for(int i=0;i<n;i++){
                    if(bannew[i]){
                        List banrownew =new ArrayList<Boolean>();
                        for(int j=0;j<n;j++){
                            banrownew.add(j,banrow.get(j));
                        }
                        banrownew.set(i,false);
                        site[i]=name;
                        soloQueen(banrownew,site,name);
                    }
                }
        }
    }
}

