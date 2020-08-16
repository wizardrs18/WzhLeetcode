package com.company.easy;

public class ReverseLeftWordsOffer58 {
    public String reverseLeftWords(String s, int n) {
        String newstring=s.substring(0,n);
        s=s.substring(n);
        return s+newstring;
    }
}
