package com.company.easy;

public class NFactorialn {
    public int sumNums(int now) {
        boolean b= now >0 && (now+=sumNums(now-1))>0;
        return now;
    }
}
