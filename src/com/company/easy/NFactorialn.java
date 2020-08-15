package com.company.easy;

public class NFactorialn {
    int sum=0;
    int n;
    public int sumNums(int n) {
        this.n=n;
         circleNums(n);
         return sum;
    }
    public void circleNums(int now){
            sum+=now--;
            circleNums(now);
    }

}
