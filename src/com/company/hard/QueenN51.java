package com.company.hard;

import java.util.ArrayList;
import java.util.List;

public class QueenN51 {
    int sum=0;
    int n;
    List<List<String>> output=new ArrayList<List<String>>() {};
    public List<List<String>> solveNQueens(int n) {
        if(n==1){
            List<String> output=new ArrayList<>();
            output.add("Q");
            this.output.add(output);
            return this.output;
        }
        totalNQueens(n);
        return output;
    }
    public int totalNQueens(int n) {
        int[] site=new int[n];
        int name=0;
        this.n=n;

        for(int i=0;i<n;i++){
            boolean[] banrow=new boolean[n];
            banrow[i]=true;
            site[i]=name;
            soloQueen(banrow,site,name);
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
                    site[i]=name;
                    List<String> output=new ArrayList<>();
                    for(int j=n-1;j>=0;j--){
                        StringBuilder line= new StringBuilder();
                        for(int p=0;p<n;p++){
                            if(site[j]==p){
                                line.append("Q");
                            }else{
                                line.append(".");
                            }
                        }
                        output.add(line.toString());
                    }
                    this.output.add(output);
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
