package com.company.medium;

public class MinOperations {
    public int minOperations(int n) {
        if(n%2==1){
            return (2+(n-1))*(n>>1)/2;
        }else if(n%2==0){
            return (1+(n-1))*(n>>1)/2;
        }else return 2;
    }
}
