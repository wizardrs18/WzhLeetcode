package com.company.medium;

import javafx.util.Pair;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.List;

public class NoPermutationOrCombinationOfRepeatingStrings0807 {
    ArrayList<String> output=new ArrayList<>();
    public String[] permutation(String S) {
        List<Pair<Character,Integer>> list=new ArrayList<>();
        for (int i=0;i<S.length();i++){
            int flag=0;
            for(int j=0;j<list.size();j++){
                if(list.get(j).getKey()==S.charAt(i)){
                    list.set(j, new Pair<>(list.get(j).getKey(),list.get(j).getValue()+1));
                    flag=1;
                }
            }if(flag==0){
                list.add(new Pair<>(S.charAt(i),1));
            }
        }
        makeString("", (ArrayList<Pair<Character, Integer>>) list,S.length());
        String[] outPutArray=new String[output.size()];
        for(int i=0;i<output.size();i++){
            outPutArray[i]=output.get(i);
        }
        return outPutArray;
    }
    public void makeString(String input,ArrayList<Pair<Character,Integer>>  list,int sum){
        if(input.length()==sum){
            output.add(input);
            return;
        }
        for(int j=0;j< list.size();j++){
                String inputCopy=input;
                inputCopy+=list.get(j).getKey();
                ArrayList<Pair<Character,Integer>> listCopy= (ArrayList<Pair<Character, Integer>>) list.clone();
                if(listCopy.get(j).getValue()==1){
                    listCopy.remove(j);
                }else {
                    listCopy.set(j,new Pair<Character, Integer>(listCopy.get(j).getKey(),listCopy.get(j).getValue()));
                }
                makeString(inputCopy,listCopy,sum);
        }
    }
}
