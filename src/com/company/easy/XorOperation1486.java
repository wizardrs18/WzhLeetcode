package com.company.easy;

public class XorOperation1486 {
//    public int xorOperation(int n, int start) {
//        int sum=start;
//        for(int i=1;i<n;i++){
//            sum^=(start+2*i);
//        }
//        return sum;
//    }
    public int xorOperation(int n, int start) {
        int xorTop = getXorResult(n + (start >> 1) - 1);
        int xorBot = (getXorResult((start >> 1) - 1));
        return ((xorTop ^ xorBot) << 1 | (start & n & 1));
    }

    public static int getXorResult(int p) {
        if (p < 0) {return 0;}
        int a = p % 4;
        switch (a) {
            case 0:
                return p;
            case 1:
                return 1;
            case 2:
                return p + 1;
            case 3:
                return 0;
            default:
                return 0;
        }
    }

}
