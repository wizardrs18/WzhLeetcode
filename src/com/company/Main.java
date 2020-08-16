package com.company;

import com.company.hard.EightQueen;
import com.company.hard.Queen;
import com.company.medium.NFactorialn;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[][] input=new int[2][2];
//        input[0][0]=1;
//        input[0][1]=1;
//        input[1][0]=1;
//        input[1][1]=1;
//
//
//        SubrectangleQuery1476 subrectangleQuery1476=new SubrectangleQuery1476(input);
//        subrectangleQuery1476.getValue(1,1);
//        Queen queen=new Queen();
//        System.out.println(queen.totalNQueens(9));
        EightQueen queen=new EightQueen();
        System.out.println(queen.solveNQueens(4));
//        int[] nums;
//        nums= new int[]{1, 2,3,1,1,3};
//        TheNumberOfGoodPairs1512 theNumberOfGoodPairs1512=new TheNumberOfGoodPairs1512();
//        System.out.println(theNumberOfGoodPairs1512.numIdenticalPairs(nums));
//        NFactorialn nFactorialn=new NFactorialn();
//        System.out.println(nFactorialn.sumNums(3));
    }
}
