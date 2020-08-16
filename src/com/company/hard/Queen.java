package com.company.hard;

public class Queen {
    int sum=0;
    int n;
    public int totalNQueens(int n) {
        int[] site=new int[n];
        int name=0;
        this.n=n;
        for(int i=0;i<Math.floor((float)n/2);i++){
            boolean[] banrow=new boolean[n];
            banrow[i]=true;
            site[i]=name;
            soloQueen(banrow,site,name);
        }
        sum=sum*2;
            if(n%2==1){
                if(n>2) {
                    boolean[] banrow=new boolean[n];
                    banrow[n/2]=true;
                    site[n/2]=name;
                    int[] sitemid=new int[n];
                    soloQueen(banrow,sitemid,name);
                }else{
                    sum++;
                }
            }
        return sum;
    }
    public void soloQueen(boolean[] banrow,int[] site,int name){
        name++;
        boolean[] bannew=new boolean[n];
        for(int i=0;i<n;i++){
            bannew[i]=banrow[i];
        }
        if(name==n-1){
            for(int j=0;j<n;j++) {
                if(banrow[j]) {
                    if (j - (name-site[j]) >= 0) {
                        bannew[j - (name-site[j])] = true;
                    }
                    if (j + (name-site[j]) < n) {
                        bannew[j + (name-site[j])] = true;
                    }
                }
            }
            for(int i=0;i<n;i++){
                if(!bannew[i]){
                    sum++;
                }
            }
        } else {
                for(int j=0;j<n;j++) {
                    if(banrow[j]) {
                        if (j - (name-site[j]) >= 0) {
                            bannew[j - (name-site[j])] = true;
                        }
                        if (j + (name-site[j]) < n) {
                            bannew[j + (name-site[j])] = true;
                        }
                    }
                }
                for(int i=0;i<n;i++){
                    if(!bannew[i]){
                        boolean[] banrownew=new boolean[n];
                        for(int j=0;j<n;j++){
                            banrownew[j]=banrow[j];
                        }
                        banrownew[i]=true;
                        site[i]=name;
                        soloQueen(banrownew,site,name);
                    }
                }
        }
    }
}

