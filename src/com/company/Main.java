package com.company;

import com.company.medium.SubrectangleQuery1476;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] input=new int[2][2];
        input[0][0]=1;
        input[0][1]=1;
        input[1][0]=1;
        input[1][1]=1;


        SubrectangleQuery1476 subrectangleQuery1476=new SubrectangleQuery1476(input);
        subrectangleQuery1476.getValue(1,1);
    }
}
