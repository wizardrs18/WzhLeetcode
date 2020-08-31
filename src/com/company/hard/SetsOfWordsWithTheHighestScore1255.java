package com.company.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SetsOfWordsWithTheHighestScore1255 {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] chaarsArray=charsArray(letters);
        ArrayList<String> list= new ArrayList<>();
        for(int i=0;i<words.length;i++){
            list.add(words[i]);
        }
        return maxScore(list,chaarsArray,score);
    }

    public int maxScore(ArrayList<String> words, int[] chaarsArray, int[] score) {
        int max=0;
        for(int i=0;i<words.size();i++){
            int sum=0;
            int[] chaarsArrayCopy=chaarsArray.clone();
            if(scoreWord(words.get(i),chaarsArray)){
                sum+=valueMax(words.get(i),score,chaarsArrayCopy);
                ArrayList<String> wordsCopy= (ArrayList<String>) words.clone();
                for(int j=0;j<=i;j++){
                    wordsCopy.remove(0);
                }
                sum+=maxScore(wordsCopy,chaarsArrayCopy,score);
                max=Math.max(sum,max);
            }
        }
        return max;
    }

    private int valueMax(String words,int[] score,int[] charsArray) {
        int sum=0;
        for(int i=0;i<words.length();i++){
            sum+=score[words.charAt(i)-97];
            charsArray[words.charAt(i)-97]--;
        }
        return sum;
    }

    public Boolean scoreWord(String word,int[] chars){
        int[] charsum=new int[26];
        for(int i=0;i<word.length();i++){
            charsum[word.charAt(i)-97]=charsum[word.charAt(i)-97]+1;
            if(charsum[word.charAt(i)-97]>chars[word.charAt(i)-97]){
                return false;
            }
        }
        return true;
    }

    public int[] charsArray(char[] letters){
        int[] letter=new int[26];
        for(int i=0;i< letters.length;i++){
            letter[(int)letters[i]-97]++;
        }
        return letter;
    }
}
