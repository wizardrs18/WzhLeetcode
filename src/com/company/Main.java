package com.company;

import com.company.hard.*;
import com.company.medium.NFactorialn;
import com.company.medium.TheNumberOfCombatUnits1395;

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
//        EightQueen queen=new EightQueen();
//        System.out.println(queen.solveNQueens(4));
//        int[] nums;
//        nums= new int[]{3,1,5,8};
        char[] chars;
        chars=new char[]{'a','b','a','z'};
//        TheNumberOfGoodPairs1512 theNumberOfGoodPairs1512=new TheNumberOfGoodPairs1512();
//        System.out.println(theNumberOfGoodPairs1512.numIdenticalPairs(nums));
//        NFactorialn nFactorialn=new NFactorialn();
//        System.out.println(nFactorialn.sumNums(3));
//        TheNumberOfCombatUnits1395 theNumberOfCombatUnits1395=new TheNumberOfCombatUnits1395();
//        System.out.println(theNumberOfCombatUnits1395.numTeams(nums));
//        RestoreTheBinaryTreeFromSequentialTraversal1028 restoreTheBinaryTreeFromSequentialTraversal1028=new RestoreTheBinaryTreeFromSequentialTraversal1028();
//        restoreTheBinaryTreeFromSequentialTraversal1028.recoverFromPreorder("1-2--3--4-5--6--7");
//        CookTheOrder cookTheOrder=new CookTheOrder();
//        System.out.println(cookTheOrder.maxSatisfaction(nums));
//        PokeTheBalloon312 pokeTheBalloon312=new PokeTheBalloon312();
//        System.out.println(pokeTheBalloon312.maxCoins(nums));
        SetsOfWordsWithTheHighestScore1255 setsOfWordsWithTheHighestScore1255=new SetsOfWordsWithTheHighestScore1255();
//        setsOfWordsWithTheHighestScore1255.charsArray(chars);
        System.out.println(setsOfWordsWithTheHighestScore1255.maxScoreWords(new String[]{"dog","cat","dad","good"},
                new char[] {'a','a','c','d','d','d','g','o','o'},
                new int[]{1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0}));
//        System.out.println(setsOfWordsWithTheHighestScore1255.maxScoreWords(new String[]{"leetcode"},
//                new char[] {'l','e','t','c','o','d'},
//                new int[]{0,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0}));
    }
}
